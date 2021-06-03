package kodlama.io.hrms.entity.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_positions")
@AllArgsConstructor
@NoArgsConstructor
public class JobPosition extends User{
	
	@Column(name="id")
	private int id;
	
	@Column(name="job_name")
	private String jobName;

	
}
