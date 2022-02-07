package ma.ensias.titsuite2_0.services;


import ma.ensias.titsuite2_0.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

}
