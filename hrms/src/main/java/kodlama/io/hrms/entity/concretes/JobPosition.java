package kodlama.io.hrms.entity.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="job_positions")
public class JobPosition extends User{
	
	@Column(name="id")
	private int id;
	
	@Column(name="job_name")
	private String jobName;

	public JobPosition(int id, String jobName) {
		super(id, jobName, jobName);
		this.id = id;
		this.jobName = jobName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
}
