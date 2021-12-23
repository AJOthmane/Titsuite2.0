package ma.ensias.titsuite2_0.repositories;

import ma.ensias.titsuite2_0.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    Customer findByEmail(String email);

}
