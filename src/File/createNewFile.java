package File;

import java.io.File;
import java.io.IOException;

/**
 * ʹ��file����һ���ļ�
 * @author admin
 *
 */
public class createNewFile {
	public static void main(String[] args) throws IOException {
		File file=new File("./demo.txt");
		if(!file.exists()){
			file.createNewFile();
			System.out.println("�ļ��Ѵ���");
		}else{
			System.out.println("�ļ��Ѵ���");
		}
	}
}
