package day4homeWork2;

import java.rmi.RemoteException;
import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import day4homeWork2.Abstract.BaseCustomerManager;
import day4homeWork2.Concrete.NeroCustomerManager;
import day4homeWork2.Concrete.StarbucksCustomerManager;
import day4homeWork2.Entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		customerManager.save(new Customer (00001, "Alp", "Karadeniz", LocalDate.of(2000,1,1), "11111111111"));  

	}

}
