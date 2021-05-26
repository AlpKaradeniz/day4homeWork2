package day4homeWork2.Concrete;

import day4homeWork2.Abstract.ICustomerCheckService;
import day4homeWork2.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
		// TODO Auto-generated method stub
		
	}
	

}
