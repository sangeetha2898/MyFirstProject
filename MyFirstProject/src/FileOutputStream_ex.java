import java.io.*;
public class FileOutputStream_ex {

	public static void main(String[] args) {
		try {
		FileOutputStream fout=new FileOutputStream("C:\\example.txt");
		fout.write(65);
		String s="java programming language";
		byte b[]=s.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("Sucess...");
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}

	}

}
