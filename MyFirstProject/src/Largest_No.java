import java.io.*;
import java.util.*;
public class Largest_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter 3 numbers");
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     if((a>b)&&(a>c))
     {
    	 System.out.println(a+" is greater");
     }
     else if((b>a)&&(b>c))
     {
    	 System.out.println(b+" is graeter");
     }
     else
     {
    	 System.out.println(c+" is greater");
     }
    	
	}

}
