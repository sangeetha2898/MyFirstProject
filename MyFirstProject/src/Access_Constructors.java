import java.io.*;
public class Access_Constructors {
	int b; String c;
	private Access_Constructors()
	{
		System.out.println("Default constructor");
		
	}
	public Access_Constructors(int a, String s)
	{
		b=a;
		c=s;
	}
    protected Access_Constructors(int a)
    {
    	this.b=a;
    }
    void disp()
    {
    	System.out.println(b+" "+c);
    }

	public static void main(String[] args) {
		Access_Constructors ob1=new Access_Constructors();
		Access_Constructors ob2=new Access_Constructors(5,"java");
		Access_Constructors ob3=new Access_Constructors(2);
		ob2.disp();
		ob3.disp();
		
		

	}

}
