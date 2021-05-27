package day4Homework3.Concrete;

import day4Homework3.Abstract.CampaingService;
import day4Homework3.Entities.Campaign;

public class CampaignManager implements CampaingService{

	@Override
	public void enterANewCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " created with %"+ campaign.getDiscountPersentage() + " discount.");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " removed from the store.");
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " updated from the store.");
		
	}

}
