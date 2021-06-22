import java.io.*;
import java.util.*;
public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n= sc.nextInt();
      System.out.println("ODD NUMBERS:");
      for(int i=1;i<=n;i++)
      {
    	  if((i%2)!=0)
    	  {
    		  System.out.println(i);
    	  }
    		
      }
      System.out.println("EVEN NUMBERS:");
      for(int i=1;i<=n;i++)
      {
    	  if((i%2)==0)
    	  {
    		  System.out.println(i);
    	  }
      }
      
	}
}
