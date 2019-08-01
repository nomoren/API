package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * jdk7�Ժ��Ƴ���һ�������ԣ�autoclose
 * ����������ڱ���������Զ������������Ĺرչ���
 * @author admin
 */
public class AutoClossDemo {
	public static void main(String[] args) {
		try(
				/*
				 * ʵ����autocloseable�ӿڵ�����������ﶨ�壬������
				 * ���ջὫ����ı䣬��finally�н���ر�
				 */
				FileOutputStream fos=new FileOutputStream("fos.data");
				){	
			fos.write(1);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
