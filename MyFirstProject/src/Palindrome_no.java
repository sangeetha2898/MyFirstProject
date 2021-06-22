import java.io.*;
import java.util.*;
public class Palindrome_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		int n=number;
		while(n!=0)
		{
			int d=n%10;
			rem=rem*10+d;
			n=n/10;
		}
		if(number==rem)
		{
			System.out.println(number+" is a palindrome number");
		}
		else
		{
			System.out.println(number+" is not a prime number");
		}
		
	}

}
