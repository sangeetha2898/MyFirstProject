interface MyInterface
{
	public abstract void method1();
	default void meth()
	{
		System.out.println("default method");
	}
}
public class Interface_ex1 implements MyInterface {
	public void method1()
	{
		System.out.println("Interface method is implemented");
	}

	public static void main(String[] args) {
		MyInterface obj=new Interface_ex1();
		obj.method1();
		obj.meth();
		

	}


}
