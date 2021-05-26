package day4homeWork2.Abstract;

import java.rmi.RemoteException;

import day4homeWork2.Entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
