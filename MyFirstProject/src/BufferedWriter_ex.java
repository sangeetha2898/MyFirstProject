import java.io.*;
public class BufferedWriter_ex {

	public static void main(String[] args)throws Exception {
		FileWriter fw=new FileWriter("C:\\file1.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("writing data usimg buffered write into a file");
		bw.close();
		fw.close();
		System.out.println("Success..");
		

	}

}
