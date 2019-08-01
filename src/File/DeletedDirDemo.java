package File;

import java.io.File;

/**
 * 删除目录
 * @author admin
 *
 */
public class DeletedDirDemo {
public static void main(String[] args) {
	File dir=new File("./Demo");
	if(dir.exists()){
		dir.delete();//delete方法要求目录是一个空目录
		System.out.println("yes");
	}else {
		System.out.println("no");
	}
}
}
