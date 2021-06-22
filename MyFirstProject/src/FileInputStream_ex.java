import java.io.*;
public class FileInputStream_ex {

	public static void main(String[] args) {
		try
		{
			FileInputStream fin=new FileInputStream(new File("text2.txt"));
			int i=fin.read();
			System.out.println((char)i);
			int j=0;
			while((j=fin.read())!=-1)
					{
				System.out.println((char)i);
					}
		
		fin.close();
		System.out.println("Success...");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
