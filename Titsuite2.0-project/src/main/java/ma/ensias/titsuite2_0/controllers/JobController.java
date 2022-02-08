package ma.ensias.titsuite2_0.controllers;

import ma.ensias.titsuite2_0.entities.Job;
import ma.ensias.titsuite2_0.services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    JobService jobService;

    @GetMapping("/myjobs/all")
    List<Job> getMyJobs(){
        int idForTest =2; // This id should be returned by JWT
        return jobService.findMyJobs(idForTest);
    }

    @GetMapping("/jobs/all")
    List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/jobs/freelancer/{id}")
    List<Job> getJobsByFreelancer(@PathVariable int id){
        return jobService.findMyJobs(id);
    }
}
