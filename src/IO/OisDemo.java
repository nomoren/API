package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

/**
 * ����������
 * ���Խ��ж���ķ����л��Ĳ���
 * ʹ�ö�������ȡ���ֽڱ�����ͨ��������������л���һ���ֽڲſ���
 * @author admin
 *
 */
public class OisDemo {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		FileInputStream fis=new FileInputStream("person.obj");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Person p=(Person)ois.readObject();
		System.out.println(p);
		ois.close();
	}
}
