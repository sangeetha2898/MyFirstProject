import java.io.*;
class Parent
{
	int a=10;
}
public class Super_ex extends Parent {
	int a=20;
	void disp()
	{
		System.out.println("child class variable:"+a);
		System.out.println("child class method");
		System.out.println("parent class variable:"+super.a);
	}

	public static void main(String[] args) {
		Super_ex obj=new Super_ex();
		obj.disp();
		

	}

}
