package File;

import java.io.File;

/**
 * ɾ��һ���ļ�
 * @author admin
 *
 */
public class DeleteFile {
public static void main(String[] args) {
	/*File file=new File("./demo.txt");
	if(file.exists()){
		file.delete();
	System.out.println("��ɾ��");
	}else{
		System.out.println("û������ļ�");
	}*/
	File dest = new File("./src/File", "a.txt");
	System.out.println(dest.getName());
}
}
