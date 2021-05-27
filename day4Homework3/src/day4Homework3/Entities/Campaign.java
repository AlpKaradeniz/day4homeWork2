package day4Homework3.Entities;

public class Campaign {
	int id;
	String campaignName;
	int discountPersentage;
	
	public Campaign(int id, String campaignName, int discountPersentage) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discountPersentage =discountPersentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getDiscountPersentage() {
		return discountPersentage;
	}

	public void setDiscountPersentage(int discountPersentage) {
		this.discountPersentage = discountPersentage;
	}
}
