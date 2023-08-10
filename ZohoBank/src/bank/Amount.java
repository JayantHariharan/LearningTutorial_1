package bank;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Amount {
	private Map<Integer,Long>userList=new HashMap<Integer,Long>();
	private int customerId=1;
	private Scanner sc = new Scanner(System.in);

	
	public void addAccount() {
		System.out.println("************************");
		userList.put(customerId++,validAmount());
		System.out.println("\n"+"****    Account Created    ****\n");
	}
	
	public void printAmountSummary() {
		System.out.println("************************");
		System.out.println("****  All user Account Summary *****");
		for(Map.Entry<Integer,Long>user:userList.entrySet()) {
			System.out.println("----------------------------");
			Integer key=user.getKey();
			Long amount=user.getValue();
			System.out.println("Customer Id: "+key+"       Amount: "+amount);
			System.out.println("----------------------------");
		}
			
		}
	private long validAmount() {
		while (true) {
            System.out.print("Enter the Amount: ");
            long amount = sc.nextLong();
            if (amount > 0) {
                return amount;
            } else {
                System.out.println("Invalid amount entered. Please enter a valid amount.");
            }
        }
	}
}
