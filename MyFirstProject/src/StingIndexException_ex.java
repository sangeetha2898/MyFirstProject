import java.io.*;
public class StingIndexException_ex {

	public static void main(String[] args) {
		String s=new String(" jala technology");
		try {
			
			System.out.println(s.charAt(45));
		}
		catch(StringIndexOutOfBoundsException er)
		{
			System.out.println(er);
		}
		
	}

}
