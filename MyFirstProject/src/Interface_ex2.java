interface MyInterface1
{
	void method1();
	void method2(int a);
	
}
public class Interface_ex2 implements MyInterface1 {
	public void method1()
	{
		System.out.println("Interface method 1");
	}
	//Implemented class should always implement all the methods of interface
	
	public void method2(int a)
	{
		System.out.println("Value passed :"+a+"\tInterface method 2");
	}

	public static void main(String[] args) {
		Interface_ex2 obj=new Interface_ex2();
		obj.method1();
		obj.method2(5);
		
	}

}
