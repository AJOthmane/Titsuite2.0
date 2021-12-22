package ma.ensias.titsuite2_0.services;

import ma.ensias.titsuite2_0.entities.Job;
import ma.ensias.titsuite2_0.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    JobRepository jobRepository;

    public List<Job> findMyJobs(int freelancerId){

        return jobRepository.findMyJobsByFreelancer(freelancerId);
    }
}
