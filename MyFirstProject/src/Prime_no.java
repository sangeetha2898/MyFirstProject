import java.io.*;
import java.util.*;
public class Prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if((n%i)==0)
				count=count+1;
		}
		if(count==2)
		{
		System.out.println(n+" is a prime number");
	    }
		else
		{
			System.out.println(n+" is not a prime number");
		}
}
}