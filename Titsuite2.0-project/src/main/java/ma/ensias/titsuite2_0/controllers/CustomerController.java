package ma.ensias.titsuite2_0.controllers;

import ma.ensias.titsuite2_0.model.CustomerForm;
import ma.ensias.titsuite2_0.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/register")
    public boolean signUp(@RequestBody CustomerForm data)
    {
        return customerService.signUp(data);
    }


}
