package ma.ensias.titsuite2_0.repositories;

import ma.ensias.titsuite2_0.entities.Customer;
import ma.ensias.titsuite2_0.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OfferRepository extends JpaRepository<Offer,Long>
{
        List<Offer> findByCity(String city);
        List<Offer> findByActivity(String activity);

//        @Query(value = "select O.* from offer O where O.customer_id = :id ;",
//                nativeQuery = true)
        List<Offer> findAllByCustomerId(Long id);

}