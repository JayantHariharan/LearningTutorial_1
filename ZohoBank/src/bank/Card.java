package bank;

public class Card {

	int customerId;
	long userAmount;
	boolean status;
	
	public Card(int id,long amount,boolean stat) {
		// TODO Auto-generated constructor stub
		this.customerId=id;
		this.userAmount=amount;
		this.status=stat;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public long getUserAmount() {
		return userAmount;
	}

	public void setUserAmount(long userAmount) {
		this.userAmount = userAmount;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
