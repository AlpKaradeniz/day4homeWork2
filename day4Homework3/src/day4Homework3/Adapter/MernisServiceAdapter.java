package day4Homework3.Adapter;

import java.rmi.RemoteException;
import java.util.Locale;
import day4Homework3.Abstract.IdentityCheckService;
import day4Homework3.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IdentityCheckService{

	@Override
	public boolean checkIfRealPerson (Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = true;
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
					 customer.getFirstName().toUpperCase(new Locale("tr")), 
					 customer.getLastName().toUpperCase(new Locale("tr")), 
					 customer.getDateOfBirth().getYear());
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	

}
