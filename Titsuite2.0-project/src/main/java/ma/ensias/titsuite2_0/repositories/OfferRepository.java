package ma.ensias.titsuite2_0.repositories;

import ma.ensias.titsuite2_0.entities.Customer;
import ma.ensias.titsuite2_0.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OfferRepository extends JpaRepository<Offer,Long>
{
        List<Offer> findByCity(String city);
        List<Offer> findByActivity(String activity);

}