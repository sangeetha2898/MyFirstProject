import java.io.*;
import java.util.*;
public class Switch_Even_Odd {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	switch(n%2)
	{
		case 0:
			
				System.out.println("given number is even");
			
			break;
		case 1:
			
				System.out.println("given number is odd");
			
			break;
		
	}

	}

}
