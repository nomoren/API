package File;

import java.io.File;
import java.io.IOException;

/**
 * 使用file创建一个文件
 * @author admin
 *
 */
public class createNewFile {
	public static void main(String[] args) throws IOException {
		File file=new File("./demo.txt");
		if(!file.exists()){
			file.createNewFile();
			System.out.println("文件已创建");
		}else{
			System.out.println("文件已存在");
		}
	}
}
