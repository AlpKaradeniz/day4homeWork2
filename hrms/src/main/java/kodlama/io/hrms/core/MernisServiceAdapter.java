package kodlama.io.hrms.core;

import java.rmi.RemoteException;
import java.util.Locale;

import kodlama.io.hrms.entity.concretes.JobSeeker;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements MernisService{

	@Override
	public boolean checkIfRealPerson(JobSeeker jobseeker) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = true;
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(jobseeker.getNationalityId()), 
					jobseeker.getFirstName().toUpperCase(new Locale("tr")), 
					jobseeker.getLastName().toUpperCase(new Locale("tr")), 
					jobseeker.getBirthDate().getYear());
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
