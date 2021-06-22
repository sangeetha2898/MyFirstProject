import java.io.*;
class ProtectedParent
{
	protected int a=10;
	protected String s="jala technology";
	protected void method()
	{
		System.out.println(a+" "+s);
	}
}
public class ProtectedAccess_ex extends ProtectedParent {

	public static void main(String[] args) {
		ProtectedAccess_ex obj=new ProtectedAccess_ex();
		obj.method();
		

	}

}
