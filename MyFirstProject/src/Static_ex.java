import java.io.*;
public class Static_ex {
static int a=5;
static String var1="Non static member";
 
 static void disp()
 {
	
	System.out.println(a+" "+var1);
 }
 void method()
 {
 	 disp();
 }
	public static void main(String[] args) {
		Static_ex obj=new Static_ex();
     obj.method();
	}

}
