package day4homeWork2.Abstract;

import day4homeWork2.Entities.Customer;

public interface ICustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
