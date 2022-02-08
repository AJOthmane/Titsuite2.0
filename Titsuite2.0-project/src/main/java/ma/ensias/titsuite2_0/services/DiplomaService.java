package ma.ensias.titsuite2_0.services;

import ma.ensias.titsuite2_0.entities.Diploma;
import ma.ensias.titsuite2_0.repositories.DiplomaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiplomaService {

    @Autowired
    DiplomaRepository diplomaRepository;

    public Diploma getDiplomaByID(long id){
        return diplomaRepository.findById(id);
    }
}
