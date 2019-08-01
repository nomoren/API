package IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲输出流的缓冲区问题
 * 缓冲流的write方法并不是立即将数据写出，而是先将数据存取其内部数组中，
 * 当数组装满时才会做一次真实写操作（转化为块写操作的过程）
 * @author admin
 *
 */
public class Bos_fkushDemo {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos=new FileOutputStream("box.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		String line="你是隔壁的太少";
		byte[] data=line.getBytes("utf-8");
		bos.write(data);
		//bos.flush();
		bos.close();
		/*
		 * flush方法的意义是强制将已经缓冲的数据一次性写出，这样做可以让写出的数据
		 * 有即时性，但是频繁调用会降低些效率，在更关注写出的即时性应该使用该方法
		 */
	}
}
