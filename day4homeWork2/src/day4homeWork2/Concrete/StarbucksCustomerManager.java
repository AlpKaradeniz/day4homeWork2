package day4homeWork2.Concrete;

import day4homeWork2.Entities.Customer;

import java.rmi.RemoteException;

import day4homeWork2.Abstract.BaseCustomerManager;
import day4homeWork2.Abstract.CustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager{
	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	public void save(Customer customer) throws NumberFormatException, RemoteException {
	if(customerCheckService.checkIfRealPerson(customer)) {
		super.save(customer);
		}else {
			System.out.println("Not a valid person");
		}
	
	}
}
