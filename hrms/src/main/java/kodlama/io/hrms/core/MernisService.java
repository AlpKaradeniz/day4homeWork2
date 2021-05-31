package kodlama.io.hrms.core;

import kodlama.io.hrms.entity.concretes.JobSeeker;

public interface MernisService {
	boolean checkIfRealPerson(JobSeeker jobseeker);
}
