import java.io.*;
public class Loca_Global_Variable {
   static int a=9;
	public static void main(String[] args) {
		
    System.out.println(a);
    Loca_Global_Variable obj=new Loca_Global_Variable ();
    obj.add();
	}
   void add()
   {
	  int a=5;
	   System.out.println(a);
	   
   }
}
