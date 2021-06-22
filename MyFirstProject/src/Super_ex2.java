import java.io.*;
class Parent1
{
	Parent1()
	{
		System.out.println("parent class constructor");
	}
	Parent1(int b)
	{
		System.out.println(b);
	}
}
public class Super_ex2 extends Parent1 {
	Super_ex2()
	{
		//super();
		System.out.println("child class constructor");
	}
	Super_ex2(int a)
	{
		super(6);
		System.out.println(a);
	}


	public static void main(String[] args) {
		Super_ex2 ob=new Super_ex2();
		Super_ex2 ob2=new Super_ex2(5);
		

	}

}
