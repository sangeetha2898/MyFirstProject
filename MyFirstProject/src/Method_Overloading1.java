import java.io.*;
public class Method_Overloading1 {
	void add(int n1,int n2)
	{
		System.out.println("Sum of 2 numbers:"+(n1+n2));
	}
	void add(int n1,int n2,int n3)
	{
		System.out.println("Sum of 3 numbers:"+(n1+n2+n3));
	}

	public static void main(String[] args) {
		Method_Overloading1 obj=new Method_Overloading1();
		obj.add(2,3);
		obj.add(2,3,4);

	}

}
