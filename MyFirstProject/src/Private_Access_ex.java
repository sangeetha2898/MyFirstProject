import java.io.*;
class Private_Access_ex
{
	private int a=10;
	private int b=20;
	private String s="jala technology";
	private void disp()
	{
		System.out.println("sum:"+(a+b));
		
	}
	
	public static void main(String[] args) {
		Private_Access_ex ob = new Private_Access_ex();
		ob.disp();
		//System.out.println("a="+a+" b="+b+" s="+s); //->you can not print private members 
		
	}
}
/* class Private_child extends Private_Access_ex {
	 Private_child() {
			
		}

	public static void main(String[] args) {
		Private_child obj=Private_child();
		obj.disp();
		System.out.println(obj.a+" "+obj.s);
		//private members are not visible to child class
		

	}


	
}

} */
