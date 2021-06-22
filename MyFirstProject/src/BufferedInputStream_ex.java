import java.io.*;
public class BufferedInputStream_ex {

	public static void main(String[] args) throws Exception{
		FileInputStream fin=new FileInputStream("C:\\textexample.txt");
		BufferedInputStream bin=new BufferedInputStream(fin);
		int i=0;
		while((i=bin.read())!=-1)
		{
			System.out.println((char)i);
			
		}
		bin.close();
		fin.close();
		System.out.println("Success..");

	}

}
