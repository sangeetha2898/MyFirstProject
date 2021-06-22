import java.io.*;
import java.util.*;
public class Smaller_Larger_no {

	public static void main(String[] args) {
		int l,s;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 2 number");
	int a=sc.nextInt();
	int b=sc.nextInt();
	if(a>b)
	{
		l=a;
		s=b;
	}
	else
	{
		l=b;
		s=a;
	}
	System.out.println("Larger number:"+l);	
	System.out.println("Smaller number:"+s);	
	}

}
