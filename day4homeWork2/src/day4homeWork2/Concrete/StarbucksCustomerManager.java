package day4homeWork2.Concrete;

import day4homeWork2.Entities.Customer;

import day4homeWork2.Abstract.BaseCustomerManager;
import day4homeWork2.Abstract.ICustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager{
	private ICustomerCheckService customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	
	
	if(customerCheckService.CheckIfRealPerson(customer)) {
		CheckIfRealPerson(customer);
	}
	}
}
