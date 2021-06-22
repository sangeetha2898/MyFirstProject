import java.io.*;
import java.util.*;
public class Index {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int sum=0;
		System.out.println("enter total array numbers");
		int n=sc.nextInt();
		System.out.println("enter array values");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the number to find its index");
		int num=sc.nextInt();
		for(int i=0;i<n;i++)
		{
	    if(num==a[i])
	    {
	    	System.out.println("Index of "+num+"="+i);
	    }	
	  }

}
}
