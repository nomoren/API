package File;

import java.io.File;

/**
 * 获取一个目录中的所有子项
 * @author admin
 *
 */
public class ListFiles {
	public static void main(String[] args) {
	File dir=new File("./a");
	if(dir.isDirectory()){
		File[] subs=dir.listFiles();
		for(int i=0;i<subs.length;i++){
			File sub=subs[i];
			System.out.println(sub.getName());
		}
	}
	/**
	 * boolean isFile
	 * boolean isDirectory
	 * 判断是文件还是文件目录
	 */
	}
}
