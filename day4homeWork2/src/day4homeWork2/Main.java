package day4homeWork2;

import java.time.LocalDate;

import day4homeWork2.Abstract.BaseCustomerManager;
import day4homeWork2.Concrete.NeroCustomerManager;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(00001, "Alp", "Karadeniz", LocalDate.of(2000,1,1), "11111111111");  

	}

}
