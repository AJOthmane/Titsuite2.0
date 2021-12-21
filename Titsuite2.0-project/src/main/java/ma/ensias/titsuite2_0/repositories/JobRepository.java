package ma.ensias.titsuite2_0.repositories;

import ma.ensias.titsuite2_0.entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {

    @Query(value = "select J.* from job J, freelancer F where F.ID = :freelancerID and J.freelancer_id = F.ID;",
            nativeQuery = true)
    List<Job> findMyJobsByFreelancer(@Param("freelancerID") int freelancerID);
}
