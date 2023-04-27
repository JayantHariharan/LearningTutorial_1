import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String sen=sc.nextLine();
		int sum=0,flag=0;
		for(int i=0;i<sen.length();i++){
		    int temp=Character.getNumericValue(sen.charAt(i));
		    if(temp==0 || temp==1){
		        flag=1;
		        sum+=temp;
		    }else{
		        for(int j=2;j<temp;j++){
		            if(temp%j==0){
		                flag=1;
		                sum+=temp;
		                break;
		            }
		        }
		    }
		}
		System.out.print(flag==1?sum:-1);

	}
}
