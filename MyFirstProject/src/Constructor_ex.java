import java.io.*;
public class Constructor_ex {
int A,B; String S;
	Constructor_ex()
	{
		System.out.println("This ia a default constructor");
	}
	Constructor_ex(String s)
	{
		this.S=s;
	}
	Constructor_ex(int a,int b)
	{
		this.A=a;
		this.B=b;
	}
	public void disp()
	{
		System.out.println(+A+" "+B+" "+S);
	}
	public static void main(String[] args) {
		Constructor_ex obj1=new Constructor_ex();
		
		Constructor_ex obj2=new Constructor_ex("java");
		Constructor_ex obj3=new Constructor_ex(5,2);
		
		
		obj2.disp();
		obj3.disp();
		
		

	}

}
