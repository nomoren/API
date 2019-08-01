package exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ��io������ʹ���쳣�������
 * @author admin
 *
 */
public class FinallyDemo2 {
	public static void main(String[] args) {
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("fos.dat");
			fos.write(1);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos!=null)
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
