import java.io.*;
public class Static_example {
static int a=10;
static String s1="Jala";
static void method1()
{
	System.out.println(a+" "+s1);
}
static void method2()
{
	System.out.println(a+" "+s1);
}
void method3()
{
	int a=5;
	String s2="Technology";
	System.out.println(a+" "+s2);
}
void method4(int a,String s2)
{
	System.out.println(a+" "+s2);
}
	public static void main(String[] args) {
	method1();
	Static_example obj1=new Static_example();
	obj1.a=20;
	obj1.s1="Programming";
	method2();
	Static_example obj2=new Static_example();
	obj2.method3();
	obj2.method4(8,"non static method ");
	

	}

}
