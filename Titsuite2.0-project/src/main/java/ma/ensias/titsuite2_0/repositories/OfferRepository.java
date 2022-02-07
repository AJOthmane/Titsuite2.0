package ma.ensias.titsuite2_0.repositories;

import ma.ensias.titsuite2_0.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OfferRepository extends JpaRepository<Offer,Long>
{
        List<Offer> findByCity(String city);
        List<Offer> findByActivity(String activity);
        List<Offer> findAllByCustomerId(Long id);

}