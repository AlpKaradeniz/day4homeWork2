package day4Homework3.Concrete;

import day4Homework3.Abstract.StoreService;
import day4Homework3.Entities.Campaign;
import day4Homework3.Entities.Customer;
import day4Homework3.Entities.Game;

public class StoreManager implements StoreService{

	@Override
	public void saleWithoutCampaign(Customer customer, Game game) {
		System.out.println(game.getGameName() + " / " + game.getGameCategory() + " Purchase from: " + game.getPrice());
		System.out.println("Congratulations " + customer.getFirstName() + ", you have purchased the game with succesfully!");
	}

	@Override
	public void saleWithCampaign(Customer customer, Game game, Campaign campaign) {
		var result = game.getPrice() - (game.getPrice() * campaign.getDiscountPersentage()/ 100);
		
		System.out.println(game.getGameName() + " / " + game.getGameCategory() + " Purchase with " + campaign.getCampaignName() + " from: " + result);
		System.out.println("Congratulations " + customer.getFirstName() + ", you have purchased the game with succesfully!");
		
	}

}
