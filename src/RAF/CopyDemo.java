package RAF;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 文件复制操作
 * @author admin
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException, InterruptedException {
		/*
		 * 创建两个raf，一个用来读源文件，
		 * 一个用来往复制文件中写
		 * 顺序从源文件读取每个字节写入到复制文件中
		 */
		RandomAccessFile src=new RandomAccessFile("image.jpg","r");
		RandomAccessFile desc=new RandomAccessFile("image1.jpg","rw");
		int d=-1;
		while((d=src.read())!=-1){
			desc.write(d);
		}
		System.out.println("ok");
	}
}
