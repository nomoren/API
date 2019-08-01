package RAF;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io。randomAccessFile
 * raf是专门用来读写文件数据的api，其基于指针对文件数据进行读写操作，可以灵活的编辑文件
 * 内容。创建raf时可以指定对该文件的权限。常用的有两种
 * r:只读模式
 * rw：只写模式
 * @author admin
 *
 */
public class Raf {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("raf.txt", "rw");
		/**
		 * void writr（int d）
		 * 向文件中写入1字节，写的是给定int值对应的2进制的低8位
		 * 00000000 00000000 00000000 00000001
		 */
		raf.write(2);
		raf.close();
	}
}
