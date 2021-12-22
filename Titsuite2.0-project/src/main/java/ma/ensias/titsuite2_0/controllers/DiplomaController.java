package ma.ensias.titsuite2_0.controllers;

import ma.ensias.titsuite2_0.entities.Diploma;
import ma.ensias.titsuite2_0.services.DiplomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiplomaController {

    @Autowired
    DiplomaService diplomaService;

    @GetMapping("/diplomas/{id}")
    Diploma getDiplomaByID(@PathVariable long id){
        return diplomaService.getDiplomaByID(id);
    }

}
