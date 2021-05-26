package day4homeWork2.Concrete;

import day4homeWork2.Abstract.CustomerCheckService;
import day4homeWork2.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

	

}
