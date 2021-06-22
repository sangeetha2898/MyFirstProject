import java.io.*;
 class Super {
public Super() {
	System.out.println("default constructor");
		
	}
	public Super(String s)
	{
		this();
		System.out.println(s);
	}


}
	
class Super_ex3 extends Super
{
	public static void main(String[] args) {
		Super ob=new Super("current constructor");
		
	

	}

}
