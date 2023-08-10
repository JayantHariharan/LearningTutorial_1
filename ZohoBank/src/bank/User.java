package bank;
import java.util.*;
public class User {
	
	private Scanner sc=new Scanner("System.in");
	
	public void amount() {
		Amount amount=new Amount();
		boolean choice=true;
		while(choice) {
			System.out.println("************************");
			System.out.println("***Enter the Choice*****");
			System.out.println("*** 1.Create Account ***");
			System.out.println("*** 2.Account Summary **");
			System.out.println("************************");
			System.out.print("Enter your Choice: ");
			switch (sc.nextInt()) {
			case 1: 
				amount.addAccount();
				break;
			case 2:
				amount.printAmountSummary();
				break;
			default:
				choice=false;
			}
		}
		
	}
	
	public void gift() {
		GiftCard gift=new GiftCard();
		boolean choice=true;
		while(choice) {
			System.out.println("************************");
			System.out.println("***Enter the Choice*****");
			System.out.println("*** 1.Create Account ***");
			System.out.println("*** 2.Account Summary **");
			System.out.println("***   3.Block       ****");
			System.out.println("************************");
			System.out.print("Enter your Choice: ");
			switch (sc.nextInt()) {
			case 1: 
				gift.addGiftCard();
				break;
			case 2:
				gift.printGiftSummary();
				break;
			case 3:
				gift.block();
				break;
			default:
				choice=false;
			}
		}
	}
	
	public void tranaction() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		User user=new User();
		boolean choice=true;
		while(choice) {
			System.out.println("************************");
			System.out.println("***Enter the Choice*****");
			System.out.println("***     1.Amount    ****");
			System.out.println("***     2.Gift Card ****");
			System.out.println("***     3.Transaction **");
			System.out.println("************************");
			System.out.print("Enter your Choice: ");
			switch (sc.nextInt()) {
			case 1: 
				user.amount();
				break;
			case 2:
				user.gift();
				break;
			case 3:
				user.tranaction();
				break;
			default:
				choice=false;
			}
		}
	}

}
