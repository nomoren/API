package File;

import java.io.File;

/**
 * ����һ��Ŀ¼mkdir�ʹ���һ���༶Ŀ¼mkdirs
 * @author admin
 *
 */
public class MkDirDemo {
public static void main(String[] args) {
	/**
	 * �ڵ�ǰĿ¼����һ����ΪDemo��Ŀ¼
	 */
	/*File file=new File("./Demo");
	if(!file.exists()){
		file.mkdir();
		System.out.println("yes");
	}else {
		System.out.println("no");
	}*/
	/**
	 * �ڵ�ǰ�ļ����´���һ��a/b/c/d/e/fĿ¼
	 * mkdir����Ŀ¼Ҫ��Ŀ¼�������
	 * mkdirs�Ὣ�����ڵĸ�Ŀ¼һͬ��������
	 */
	File dir =new File("./a/b/c/d/e/f");
	if(!dir.exists()){
		dir.mkdirs();
		System.out.println("yes");
	}else {
		System.out.println("no");
	}
}
}
