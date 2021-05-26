package day4homeWork2.Abstract;

import java.rmi.RemoteException;

import day4homeWork2.Entities.Customer;

public interface CustomerService {
	void save (Customer customer) throws NumberFormatException, RemoteException ;
	
	
	
}
