import java.io.*;
import java.util.*;
public class Armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int rem,sum=0;
        int temp=n;
        while(temp!=0)
        {
        	rem=temp%10;
        	sum=sum+(rem*rem*rem);
        	temp=temp/10;
        }
        if(sum==n)
        {
        	System.out.println(n+" is an Armstrong number");
        }
        else
        {
        	System.out.println(n+" is not an Armstrong number");
        }
        		
	}

}
