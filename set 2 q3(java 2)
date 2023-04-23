import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String sarr[]=sc.nextLine().split(" ");
		String res1="",res2="";
		int num1=0,num2=0;
		for(int i=1;i<sarr[0].length();i+=2){
		    res1+=sarr[0].charAt(i)+""+sarr[0].charAt(i-1)+"";
		}
		if(sarr[0].length()%2!=0){
		    res1+=sarr[0].charAt(sarr[0].length()-1);
		}
		for(int i=1;i<sarr[1].length();i+=2){
		    res2+=sarr[1].charAt(i)+""+sarr[1].charAt(i-1)+"";
		}
		if(sarr[1].length()%2!=0){
		    res2+=sarr[1].charAt(sarr[1].length()-1);
		}
		num1=Math.abs(Integer.parseInt(res1));
		num2=Math.abs(Integer.parseInt(res2));
		System.out.print(num1+num2);

	}
}
