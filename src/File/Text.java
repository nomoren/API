package File;

import java.io.File;

/**
 * ��ɷ�����ʵ��ɾ������file����ʾ���ļ���Ŀ¼
 * @author admin
 *1.1+2+3+...+100,���ÿ�ν�����õݹ�
 *2.һ��Ǯһƿˮ��2����ƿ��һƿ��3��ƿ�ǻ�һƿ��20��Ǯ�õ���ƿ��
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
				delete(sub);//�ݹ����
			}
		}
		f.delete();
	}
}
