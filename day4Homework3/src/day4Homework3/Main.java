package day4Homework3;

import java.time.LocalDate;
import day4Homework3.Adapter.MernisServiceAdapter;
import day4Homework3.Concrete.CampaignManager;
import day4Homework3.Concrete.CustomerManager;
import day4Homework3.Concrete.StoreManager;
import day4Homework3.Entities.Campaign;
import day4Homework3.Entities.Customer;
import day4Homework3.Entities.Game;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(1000001, "Alp", "Karadeniz", LocalDate.of(1993,05,31), "21671653258");
		
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		customerManager.register(customer);
		customerManager.accountDelete(customer);
		customerManager.accountInfoUpdate(customer);
		
		System.out.println("******************************************************************************");
		
		Campaign campaign = new Campaign(2000001, "Spring Sale 2020", 60);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.enterANewCampaign(campaign);
		campaignManager.deleteCampaign(campaign);
		campaignManager.updateCampaign(campaign);
		
		System.out.println("******************************************************************************");
		
		Game game1 = new Game(3000001, "The Witcher III: Wild Hunt", "Action, RPG, Open Wold...", 80);
		Game game2 = new Game(3000002, "Red Dead Redemption II", "Action, Adventure, Shooter...", 240);
		Game game3 = new Game(3000003, "The Witcher III", "Action, Adventure, Ancient Greece...", 480);
		
		StoreManager store = new StoreManager();
		store.saleWithCampaign(customer, game3, campaign);		
		store.saleWithoutCampaign(customer, game3);
	}

}
