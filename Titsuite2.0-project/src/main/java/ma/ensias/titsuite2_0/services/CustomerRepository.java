package ma.ensias.titsuite2_0.services;

import ma.ensias.titsuite2_0.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
