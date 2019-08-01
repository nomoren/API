package IO;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;

public class text11 {

	public static void main(String[] args) throws IOException {
//		OutputStream out=new FileOutputStream("raf.txt");
//		int age=1;
//		out.write
	/*	RandomAccessFile raf=new RandomAccessFile("raf.txt", "rw");
		int age=1;
		raf.writeInt(age);*/
		FileOutputStream fos=new FileOutputStream("fox.txt",true);
		OutputStreamWriter osw=new OutputStreamWriter(fos, "gbk");
		BufferedWriter  bw=new BufferedWriter(osw);
		PrintWriter pw=new PrintWriter(bw,true);
		pw.println("bbb");
	}

}
