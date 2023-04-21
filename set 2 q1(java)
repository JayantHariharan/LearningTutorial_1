import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String sarr[]=sc.nextLine().split(" ");
		int min=10,max=0;
		for(int i=0;i<4;i++){
		    min=10;
		    max=0;
		  for(int a=0;a<sarr.length;a++){
		      int t=Character.getNumericValue(sarr[a].charAt(i));
		      if(i%2==0){
		          if(min>t){
		              min=t;
		          }
		      }else{
		          if(max<t){
		              max=t;
		          }
		      }
		  }
		  System.out.print(i%2==0?min:max);
		}

	}
}
