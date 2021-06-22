import java.io.*;
public class BufferedOutputStream_ex {

	public static void main(String[] args)throws Exception {
		FileOutputStream fout=new FileOutputStream("C:\\textexmple.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		bout.write(65);;
		String s="Writing data using Buffered output stream";
		byte b[]=s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("Success..");
		
	
	}

}
