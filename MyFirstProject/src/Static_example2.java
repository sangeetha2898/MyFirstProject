import java.io.*;
public class Static_example2 {
	int a=10;
	String var1="Non static member";
	static int b=20;
	static String var2="Static member";

	public static void main(String[] args) {
		Static_example2 obj=new Static_example2();
		System.out.println(obj.a+" "+obj.var1);
		System.out.println(b+" "+var2);
		
	
	}

}
