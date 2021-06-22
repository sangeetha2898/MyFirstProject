import java.io.*;
public class Static_ex3 {
	static int a=10,b=20;
	static void method1()
	{
		System.out.println("Static method ");
		System.out.println(a+b);
	}
	void method2(int a,int b)
	{
		System.out.println("Non static method");
		System.out.println(a+b);
	}
	public static void main(String args[])
	{
		Static_ex3 obj=new Static_ex3();
		obj.method2(2, 3);
		method1();
	}
	{
		
	}

}
