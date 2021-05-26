package Adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import day4homeWork2.Abstract.CustomerCheckService;
import day4homeWork2.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean result = true;
		
		result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
				 customer.getFirstName().toUpperCase(new Locale("tr")), 
				 customer.getLastName().toUpperCase(new Locale("tr")), 
				 customer.getDateOfBirth().getYear());
		
		return result;
	}

}
