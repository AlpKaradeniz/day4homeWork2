package day4homeWork2.Abstract;

import java.time.LocalDate;

import day4homeWork2.Entities.Customer;

public class BaseCustomerManager implements ICustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db: " + customer.getFirstName());
	}
		
	

	public void save(int i, String string, String string2, LocalDate of, String string3) {
		// TODO Auto-generated method stub
		
	}

}
