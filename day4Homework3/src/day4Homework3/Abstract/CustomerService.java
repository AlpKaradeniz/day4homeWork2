package day4Homework3.Abstract;

import day4Homework3.Entities.Customer;

public interface CustomerService {
	void register (Customer customer);
	void accountInfoUpdate (Customer customer);
	void accountDelete (Customer customer);
}
