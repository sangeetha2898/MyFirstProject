import java.io.*;
public class Arithmetic_operators {

	public static void main(String[] args) 
	{
		Arithmetic_operators obj=new Arithmetic_operators();
		obj.Calc(8,5);
		
	}
	void Calc(int a, int b)
	{
		System.out.println("Addition:"+(a+b));
		System.out.println("Subtraction:"+(a-b));
		System.out.println("Multiplication:"+(a*b));
		System.out.println("Division:"+(a/b));
		
	}

}
