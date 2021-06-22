import java.io.*;
import java.math.*;
import java.util.*;
public class Scientific_Calculator extends Calculate {

	public void method2()  {
		Double dblNum=0.0;Double dblNum1=0.0;
		String cOperator=" "; String s;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	try
	{
	do
	{
	System.out.println("Enter the number");
	//String s=br.readLine();
	 dblNum=Double.parseDouble(br.readLine());
	 
	 
	System.out.println("Enter the operator");
	cOperator=br.readLine();
	
	
	
	Calculate obj3=new Calculate();
	Calculate obj4=new Calculate(dblNum,cOperator);
	System.out.println("Continue?");
	 s=br.readLine();
	 //System.out.println(s);
	}
	while(!s.equals("stop"));
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		
		
	}

	

}
