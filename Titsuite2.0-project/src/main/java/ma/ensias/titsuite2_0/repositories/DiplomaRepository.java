package ma.ensias.titsuite2_0.repositories;

import ma.ensias.titsuite2_0.entities.Diploma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiplomaRepository extends JpaRepository<Diploma, Long> {

    Diploma findById(long id);


}
