package File;

import java.io.File;

/**
 * 删除一个文件
 * @author admin
 *
 */
public class DeleteFile {
public static void main(String[] args) {
	/*File file=new File("./demo.txt");
	if(file.exists()){
		file.delete();
	System.out.println("已删除");
	}else{
		System.out.println("没有这个文件");
	}*/
	File dest = new File("./src/File", "a.txt");
	System.out.println(dest.getName());
}
}
