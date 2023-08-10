package bank;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class GiftCard {
	
	private Scanner sc=new Scanner(System.in);
	private int cardNo=1;
	private List<GiftCard>userList=new ArrayList<>();
	private Map<Integer,userList>giftList=new HashMap<Integer,userList>();
	

	public void addGiftCard() {
		System.out.print("Enter your CustomerId: ");
		int id=sc.nextInt();
		System.out.println("Enter the amount: ");
		long amount=sc.nextLong();
	}
	
	public void printGiftSummary() {
		
	}
	
	public void block() {
		
	}
	
	
}
