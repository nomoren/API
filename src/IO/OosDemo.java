package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * ������
 * ������Ҳ�Ǹ߼������ṩ�Ĺ����Ƕ�дjava�е��κζ���
 * �����������
 * java.io.ObjectOutputStream
 * �����Խ�������java����ת��Ϊһ���ֽ�Ȼ��ͨ�������ӵ�������Щ�ֽ�д��
 * 
 * ͨ��������д����������������������������
 * 1.�������Ƚ������Ķ���ת��Ϊ��һ���ֽڣ������ֽڰ������������������Ϣ��
 * �������ö���Ľṹ��Ϣ��Ȼ�������ֽ�ͨ�������ӵ���д�������������л���
 * 2.�����ļ���ʱ���ļ����������ֽ�д�뵽���ļ���
 * ������д����̳��ñ���Ĺ��̣����ݳ־û�
 * @author admin
 *
 */
public class OosDemo {
	public static void main(String[] args) throws IOException {
		Person p=new Person();
		p.setName("����ʦ");
		p.setAge(18);
		p.setGenger("Ů");
		String[] otherInfo={"��һ����Ա","������дë����"};
		p.setOtherInfo(otherInfo);
		System.out.println(p);
		FileOutputStream fos=new FileOutputStream("person.obj");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.close();
	}
	
}
