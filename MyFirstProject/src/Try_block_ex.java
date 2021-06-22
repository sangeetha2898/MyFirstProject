import java.io.*;
public class Try_block_ex {

	public static void main(String[] args) {
		int a=10,b=0;
		try
		{
			int c=a/b;
			System.out.println(c);
			
			
		}
		catch(ArithmeticException ar)
		{
		   System.out.println(ar);	
		}
		
	}

}
