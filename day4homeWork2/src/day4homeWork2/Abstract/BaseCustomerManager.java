package day4homeWork2.Abstract;


import java.rmi.RemoteException;

import day4homeWork2.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		System.out.println("Saved to db: " + customer.getFirstName());
	}

}
