import java.io.*;
import java.math.*;
import java.lang.*;
public class Calculate implements iCalc{
	int num1,num2; char op; double result1; double dnum; String op2=" ";int result; double dblNum; 
	String cOperator=" ";
	
	Calculate()
	{
		
	}
	
	
		Calculate(int iFirstNum, char 
				cOperator, int iSecondNum)
		{
			//for basic
		this.num1=iFirstNum;
		this.op=cOperator;
		this.num2=iSecondNum;
		checkInt();
		
		}
		public void checkInt()
		{
			if ((num1 == (int)num1)&&(num2==(int)num2))
			{
				checkSecondNum();
			}
			
			//checks basic calculation is performed
		}
		
		public void checkSecondNum()
		
		{if(num2==0)
		{
			throw new ArithmeticException("Denominator cannot be 0");
		}
		else
		{
			doCalculation(num1,op,num2);
		}
		}
		
		public void doCalculation(int num1,char op, int num2)
		{
			switch(op)
			{
			case '+':
				result=num1+num2;
				break;
			case '-':
				result=num1-num2;
				break;
			case '*':
				result=num1 * num2;
				break;
			case '/':
				result=num1/num2;
				break;
				
			}
			getResult();
			
		}
		
		public void getResult()
		{
			System.out.println(result);
		}
		
		
		
		Calculate(double dblNum, 
				String cOperator)
		{
		//for scientific
			this.dnum=dblNum;
			this.op2=cOperator;
			checkDouble();
		}
		public void checkDouble()
		{
			if (dblNum == (double)dblNum)
			{
			   doCalculation();
			}
			else
			{
				System.out.println("Invalid Input");
			}
			//checks scientific calculation is performed
		}
		
		public void doCalculation()
		{
			//double dnum1=Math.toRadians(dnum);
			switch(op2)
			{
			case "sin":
			    result1=Math.sin(Math.toRadians(dnum));
			    
				break;
				
			case "cos":
				result1=Math.cos(Math.toRadians(dnum));
				break;
				
			case "tan":
				result1=Math.tan(Math.toRadians(dnum));
				break;
			case "log":
				result1=Math.log10(dnum);
				break;
			/*default:
				System.out.println("Enter valid input like");
				System.out.println("sin,cos,tan and log");*/
			}
			getResultS();
			
		}
		
		public void getResultS()
		{
			
			System.out.println(result1);
		}
		
		
		
			
		}
		
		
	
	

