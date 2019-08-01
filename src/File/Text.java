package File;

import java.io.File;

/**
 * 完成方法，实现删除给定file所表示的文件或目录
 * @author admin
 *1.1+2+3+...+100,输出每次结果，用递归
 *2.一块钱一瓶水，2个空瓶换一瓶，3个瓶盖换一瓶，20块钱得到几瓶？
 */
public class Text {
	public static void main(String[] args) {
		File dir=new File("./a");
		delete(dir);
	}
	public static void delete(File f){
		if(f.isDirectory()){
			File[] subs=f.listFiles();
			for(int i=0;i<subs.length;i++){
				File sub=subs[i]; 
				delete(sub);//递归调用
			}
		}
		f.delete();
	}
}
