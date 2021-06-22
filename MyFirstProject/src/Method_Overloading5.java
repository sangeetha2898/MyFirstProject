import java.io.*;
public class Method_Overloading5 {

	int add(int n1,int n2)
	{
		System.out.println("Sum of 2 numbers:"+(n1+n2);
	}
	void add(int n1,int n2)
	{
		System.out.println("Sum of 2 numbers:"+(n1+n2));
	}

	public static void main(String[] args) {
		Method_Overloading1 obj=new Method_Overloading1();
		obj.add(2,3);
		obj.add(4,5);
		

	}

}
