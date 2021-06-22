 interface Addition
 /*u can give interface as private or protected
 but it will give compilation error
 because interfaces are public by default*/
{
	public static final int a=10;
	int b=30;
	public abstract void add();
}
public class Interface_ex6 implements Addition{
	public void add()
	{
		System.out.println("Addition of two numbers:"+(a+b));
	}

	public static void main(String[] args) {
		Interface_ex6 obj=new Interface_ex6();
		System.out.println("a="+a+ "\tb="+b);
		obj.add();
		
	}

}
