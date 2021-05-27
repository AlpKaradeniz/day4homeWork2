package day4Homework3.Concrete;

import day4Homework3.Abstract.CustomerService;
import day4Homework3.Abstract.IdentityCheckService;
import day4Homework3.Entities.Customer;

public class CustomerManager implements CustomerService{
	
	private IdentityCheckService identityCheckService;

	public CustomerManager(IdentityCheckService identityCheckService) {
		this.identityCheckService = identityCheckService;
	}
	
	public void register(Customer customer) {
	if(identityCheckService.checkIfRealPerson(customer)) {
		System.out.println("Welcome " + customer.getFirstName() + ", your account has been successfully created.");
		}
	else 
	{
			System.out.println("Invalid identity information.");
		}
	}

	@Override
	public void accountInfoUpdate(Customer customer) {
		System.out.println("Congratulations " + customer.getFirstName() + ", your account information has been successfully changed.");
		
	}

	@Override
	public void accountDelete(Customer customer) {
		System.out.println(customer.getFirstName() + ", your account has been successfully deleted.");
		
	}
	
}
