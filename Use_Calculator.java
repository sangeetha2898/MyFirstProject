import java.io.*;
import java.util.*;

public class Use_Calculator {
	public static void main(String args[]) throws Exception
	{
		char n;
		Calculator ob1=new Calculator();
		Scientific_Calculator ob2 =new Scientific_Calculator();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Basic Calculator");
		System.out.println("Scientific Calculator");
		System.out.println("Enter your choice(b/s):");
		n=(char) br.read();
		switch(n)
		{
		case 'b':
			ob1.method1();
			break;
		case 's':
			ob2.method2();
			break;
	
		}
		
	}

}
