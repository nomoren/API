package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流
 * 对象流也是高级流，提供的功能是读写java中的任何对象
 * 对象输出流：
 * java.io.ObjectOutputStream
 * 它可以将给定的java对象转换为一组字节然后通过其连接的流将这些字节写出
 * 
 * 通过对象流写出对象的这个方法经历了两个步骤
 * 1.对象流先将给定的对象转化为了一组字节，这组字节包含对象本身保存的数据信息，
 * 还包含该对象的结构信息，然后将这组字节通过其连接的流写出（即对象序列化）
 * 2.经过文件流时，文件流将这组字节写入到了文件中
 * 将数据写入磁盘长久保存的过程：数据持久化
 * @author admin
 *
 */
public class OosDemo {
	public static void main(String[] args) throws IOException {
		Person p=new Person();
		p.setName("仓老师");
		p.setAge(18);
		p.setGenger("女");
		String[] otherInfo={"是一名演员","爱好是写毛笔字"};
		p.setOtherInfo(otherInfo);
		System.out.println(p);
		FileOutputStream fos=new FileOutputStream("person.obj");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.close();
	}
	
}
