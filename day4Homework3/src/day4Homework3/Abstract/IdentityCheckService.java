package day4Homework3.Abstract;

import day4Homework3.Entities.Customer;

public interface IdentityCheckService {
	boolean checkIfRealPerson(Customer customer);
}
