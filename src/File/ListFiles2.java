package File;

import java.io.File;
import java.io.FileFilter;

/**
 * listfiles提供了一个重载的方法，可以指定一个文件过滤器（FileFilter），
 * 然后满足该过滤器的子项返回
 * @author admin
 *
 */
public class ListFiles2 {
	public static void main(String[] args) {
		File dir=new File(".");
		Filter filter = new Filter();/*{
			public boolean accept(File file){
				String name=file.getName();
				return name.startsWith(".");
			}
		}*/
		File[] subs=dir.listFiles((file)->{
			String name=file.getName();
			return name.startsWith(".");
		});
		
		for(int i=0;i<subs.length;i++){
			System.out.println(subs[i].getName());
		}
	}
}
	 class Filter implements FileFilter{
		public boolean accept(File file) {
			String name=file.getName();
			return name.startsWith(".");
		}
		
	}

