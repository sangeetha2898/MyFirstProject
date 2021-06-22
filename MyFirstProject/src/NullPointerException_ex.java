public class NullPointerException_ex {  
String convert(String s) {  
return s.toUpperCase();  
}  
public static void main(String[] args)throws Exception {  
	NullPointerException_ex n = new NullPointerException_ex();  
System.out.println(n.convert(null));  
}  
}  