import java.io.*;
class Parent_super
{
	int a=100;
	String s1="Super method";
	public void disp(String s2)
	{
		this.s1=s2;
	}
}

public class Super_methods extends Parent_super{
	
    public void method1()
    {
    	int a=200;
    	System.out.println("child class method");
    	System.out.println("child class variable:"+a);
    	System.out.println("parent class variable:"+super.a);
    }
	public static void main(String[] args) {
		Super_methods obj=new Super_methods();
		obj.method1();
		obj.disp("parent class method");

	}

}
