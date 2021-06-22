import java.io.*;
public class Own_exception_ex extends Exception {

	public static void main(String[] args) {
	int age=25;
	try
	{
	if(age<45)
	{
		throw new Own_exception_ex();
		
	}

	}
	catch(Own_exception_ex e)
	{
		System.out.println("throwing my own exception");
	}

}
}
