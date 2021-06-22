import java.io.*;
public class Incre_Decrement {

	public static void main(String[] args)
	{
		Incre_Decrement obj=new Incre_Decrement();
		obj.increment(5);
		obj.decrement(5);
	}
	void increment(int a)
	{
		System.out.println("post increment:"+(a++));
		System.out.println("pre increment:"+(++a));
	}
	void decrement(int a)
	{
		System.out.println("post decrement:"+(a--));
		System.out.println("pre decrement:"+(--a));
	}

}
