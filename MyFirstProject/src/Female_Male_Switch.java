import java.io.*;
import java.util.*;
public class Female_Male_Switch
{

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Gender ");
	char c=sc.next().charAt(0);
	switch(c)
	{
	case 'F':
		System.out.println("Female");
		break;
	case 'M':
		System.out.println("Male");
		break;
	default:
		System.out.println("Invalid input");
		
	}
	
	}
}
