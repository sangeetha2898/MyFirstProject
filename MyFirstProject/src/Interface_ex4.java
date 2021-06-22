interface MyInterface5
{
	void disp(int a);
}
interface MyInterface6
{
	void disp(int a);
}
public class Interface_ex4 implements MyInterface5,MyInterface6 {
	public void disp(int a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		Interface_ex4 obj=new Interface_ex4();
		obj.disp(28);
		//When interface methods have same signature it can be called once
		

	}

}
