package day4Homework3.Abstract;

import day4Homework3.Entities.Campaign;

public interface CampaingService {
	void enterANewCampaign(Campaign campaign);
	void deleteCampaign(Campaign campaign );
	void updateCampaign(Campaign campaign );
}
