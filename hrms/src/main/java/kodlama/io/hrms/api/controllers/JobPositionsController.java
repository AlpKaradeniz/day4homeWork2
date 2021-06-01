package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.JobPositionService;
import kodlama.io.hrms.entity.concretes.JobPosition;


@RestController
@RequestMapping("api/jobpositions")
public class JobPositionsController {
	  private JobPositionService jobPostionService;

	  @Autowired
	public JobPositionsController(JobPositionService jobPostionService) {
		super();
		this.jobPostionService = jobPostionService;
		
	}  
	List<JobPosition> getAll(){
		return this.jobPostionService.getAll();
	}	    
}
	  