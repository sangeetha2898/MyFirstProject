import java.io.*;
public class Method_Overloading4 {

	void addition(int n1,int n2)
	{
		System.out.println("Sum of 2 numbers:"+(n1+n2));
	}
	void addition(char c1,char c2)
	{
		System.out.println("2 characters:"+c1+" "+c2 );
	}


	public static void main(String[] args) {
		Method_Overloading2 obj= new Method_Overloading2();
		obj.addition(2, 3);;
		obj.addition('A','B');
		
	}

}
