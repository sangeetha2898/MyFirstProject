import java.io.*;
import java.util.*;
public class Calculator extends Calculate {
	
	public void method1() throws IOException
	{
		int num1;
	    int num2;
		char op;
		String ss;
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		String s;
	
	do
	{ 
	System.out.println("Enter the first number");
	 num1=sc.nextInt();
	 System.out.println("Enter the second number");
	 num2=sc.nextInt();
	System.out.println("Enter the operator");
     op=sc.next().charAt(0);
	
	Calculate obj1=new Calculate();
	Calculate obj2=new Calculate(num1,op,num2);
	System.out.println("Continue?");
	 s=sc.next();
	 //System.out.println(s);
	}
	while(!s.equals("stop"));
	
	
	
	
			

}

}