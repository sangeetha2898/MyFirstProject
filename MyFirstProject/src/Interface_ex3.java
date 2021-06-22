interface MyInterface4
{
	void method1(String s);
}
interface MyInterface2
{
	void method2(int a);
}
public class Interface_ex3 implements MyInterface4,MyInterface2{
	public void method1(String s)
	{
		System.out.println(s);
	}
	public void method2(int a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		Interface_ex3 obj=new Interface_ex3();
		obj.method1("Java");
		obj.method2(10);

	}

}
