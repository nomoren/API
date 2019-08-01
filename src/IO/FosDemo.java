package IO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java io(input,output)输入与输出
 * io是我们的程序与外界交换数据的方式
 * java提供了一种统一的标准的方式与外界交换数据
 * java将流按照功能划分为读和写，并用不同的方向来表示
 * 其中输入流（外界到程序的方向）用于读取数据。输出流用于写出数据
 * Java将流划分为两大类：节点流和处理流
 * 节点流：也称低级流，是实际链接程序与数据源的”管道“，负责实际搬运数据、读写一定是建立
 * 在节点流的基础上进行的
 * 处理流：也称高级流，不能独立存在，必须链接在其他流上，目的是但数据流经过当前流时对这些
 * 数据做某些处理，这样可以简化我们对数据的操作
 * 实际应用中，我们是链接若干高级流，并最终链接低级流，通过低级流读写数据，通过高级流对
 * 读写的数据进行某些加工处理。完成一个复杂的读写操作。
 * 这个过程称为”流链接";这也是学习io的精髓所在
 * 
 * 文件流：文件流是一对低级流，用于读写文件。就功能而言，它们与randromAccressFiles一致
 * 但是底层的读写但是有本质的区别
 * Raf是基于指针进行随机读写的，可任意读写指定文件位置的数据。可以做到
 * 对文件部分数据的编辑操作
 * 流是顺序读写方式，所以不能做到任意读写指定位置数据。对此也无法做到对文件数据进行
 * 编辑操作，但是配合高级流，可以更轻松的续写数据
 * @author admin
 *
 */
public class FosDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 使用文件流向文件写出字节
		 * FileOutputStream常用构造方法
		 * FileOutputStream(string path)
		 * FileOutputStream(File file)
		 * 以上两种方法创建时，默认为覆盖写操作。即:若创建时发现该文件已存在，
		 * 会先将该文件所有数据清除，然后将通过当前流写出内容作为该文件的数据
		 * FileOutputStream(string path,boolean append)
		 * FileOutputStream(File file,boolean append)
		 * 追加写模式：即：若指定的文件存在，那么数据全保留，通过该流写出的数据
		 * 会被追加到文件最后
		 */
		FileOutputStream fos=new FileOutputStream("fox.txt",true);
		String line="和我";
		byte[] data=line.getBytes("utf-8");
		fos.write(data);
		fos.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
