package ma.ensias.titsuite2_0.services;

import ma.ensias.titsuite2_0.controllers.CustomerController;
import ma.ensias.titsuite2_0.entities.Customer;
import ma.ensias.titsuite2_0.model.CustomerForm;
import ma.ensias.titsuite2_0.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public CustomerService(BCryptPasswordEncoder bCryptPasswordEncoder){
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public Customer loadUserByUsername(String email) throws UsernameNotFoundException {
        Customer applicationUser = customerRepository.findByEmail(email);
        if (applicationUser == null) {
            throw new UsernameNotFoundException(email);
        }
        return new Customer();
    }
    public Boolean signUp(CustomerForm data)
    {
        customerRepository.save(
                new Customer(data.getEmail(),
                        bCryptPasswordEncoder.encode(data.getPassword()),
                        data.getFirstName(),
                        data.getLastName(),
                        data.getPhoneNumber(),
                        data.getBirthDate(),
                        data.getCity(),
                        data.getAddress(),
                        data.getSubscription())
        );
        return true;
    }
}
