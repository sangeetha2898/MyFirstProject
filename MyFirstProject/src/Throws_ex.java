import java.io.*;
public class Throws_ex {
	int a=10,b=0,c;
	public void method()
	{
		c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args) throws Exception {
		Throws_ex ob=new Throws_ex();
		ob.method();

	}

}
