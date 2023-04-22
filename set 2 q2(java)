import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String sen=sc.nextLine();
		int an=0,sum=0;
		for(int i=0;i<sen.length();i++){
		    an+=Math.pow(Character.getNumericValue(sen.charAt(i)),sen.length());
		}
	    for(int i=0;i<sen.length();i++){
	        int num=Character.getNumericValue(sen.charAt(i));
	        if(an==Integer.parseInt(sen)){
	            if(num%2==0){
	                sum+=num;
	            }
	        }else{
	            if(num%2!=0){
	             sum+=num;   
	            }
	        }
	    }
	    System.out.print(sum);

	}
}
