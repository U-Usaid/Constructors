package src;

public class Bank {

	String bank;
	int assets;
	
	
	Bank(String bankName, int totalAssets){
		
		this.bank = bankName;
		this.assets = totalAssets;
		
	}
	
	
	public String getBankName() {
		return bank;
	}
	
	public int getTotalAssets() {
		return assets;
	}
	
}
