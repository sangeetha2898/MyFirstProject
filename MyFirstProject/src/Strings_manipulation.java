import java.io.*;
import java.util.*;
import java.lang.*;
public class Strings_manipulation {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
	 int n;
	 
	 s1="Java is a programming Language";
	 System.out.println("s1:"+s1);
	 
	 s2=new String("Java is object oriented");
	 System.out.println("s2:"+s2);
	 
	 s3=new String("JALA "); 
	 s4="TECHNOLOGY";
	 System.out.println(s3.concat(s4));
	 
	 s5=s1.substring(10,21);
	 System.out.println("Substring od s1:"+s5);
	 
	 n=s4.indexOf('G');
	 System.out.println("Index of G:"+n);
	 
	 s6=new String("JAVA");
	 s7=new String("java");
	 System.out.println("Equals():"+s6.equals("java"));
	 System.out.println("EqualsIgnoreCase():"+s6.equalsIgnoreCase(s7));
	 
	 System.out.println("Starts with:"+s2.startsWith("Java"));
	 System.out.println("Ends with:"+s1.endsWith("age"));
	 System.out.println("Compare To:"+s6.compareTo(s7));
	 System.out.println("Compare To Ignorecase:"+s6.compareToIgnoreCase(s7));
	 
	 s8="           Hello World       ";
	 System.out.println("Trim():"+s8.trim());
	 
	 System.out.println("Replacing O with A in Technology:"+s4.replace('O','A'));
	 
	 System.out.println("Upper case to lower:"+s4.toLowerCase());
	 System.out.println("Lower case to upper:"+s7.toUpperCase());
	 
	 int val1=111;
	  s9=String.valueOf(val1);
	 System.out.println("ValueOf:Int to String Convsersion:"+s9);
	 
	 Strings_manipulation obj=new Strings_manipulation();
	 s10=obj.toString();
	 System.out.println("converting object to string:"+s10);
	 
	 
	 
	 
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
			 
	
	

}
}