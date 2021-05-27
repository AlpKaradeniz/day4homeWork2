package day4Homework3.Abstract;

import day4Homework3.Entities.Campaign;
import day4Homework3.Entities.Customer;
import day4Homework3.Entities.Game;

public interface StoreService {
	void saleWithoutCampaign (Customer customer, Game game);
	
	void saleWithCampaign (Customer customer, Game game, Campaign campaign);
	
}
