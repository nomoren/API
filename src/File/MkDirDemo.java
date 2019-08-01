package File;

import java.io.File;

/**
 * 创建一个目录mkdir和创建一个多级目录mkdirs
 * @author admin
 *
 */
public class MkDirDemo {
public static void main(String[] args) {
	/**
	 * 在当前目录创建一个名为Demo的目录
	 */
	/*File file=new File("./Demo");
	if(!file.exists()){
		file.mkdir();
		System.out.println("yes");
	}else {
		System.out.println("no");
	}*/
	/**
	 * 在当前文件夹下创建一个a/b/c/d/e/f目录
	 * mkdir创建目录要求父目录必须存在
	 * mkdirs会将不存在的父目录一同创建出来
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
