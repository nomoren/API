package File;

import java.io.File;

/**
 * ɾ��Ŀ¼
 * @author admin
 *
 */
public class DeletedDirDemo {
public static void main(String[] args) {
	File dir=new File("./Demo");
	if(dir.exists()){
		dir.delete();//delete����Ҫ��Ŀ¼��һ����Ŀ¼
		System.out.println("yes");
	}else {
		System.out.println("no");
	}
}
}
