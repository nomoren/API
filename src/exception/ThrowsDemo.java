package exception;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * ��д���ຬ��throws�����쳣�׳��ķ���ʱ����throws����д����
 * 
 * @author admin
 *
 */
public class ThrowsDemo {
public static void main(String[] args) {
	int i=128;
	long l=i;
}
	 public void dosome()throws IOException,AWTException{
		 
	 }
}
class son extends ThrowsDemo{
	/*�����׳������쳣
	public void dosome()throws IOException{
		 
	 }*/
	
	/*�����׳����෽���׳����������쳣
	public void dosome()throws FileNotFoundException{
		 
	 }*/
	
	/*�������׳������쳣
	public void dosome()throws SQLException{
		 
	 }*/
	
	/*�������׳����෽���׳��쳣�ĸ����쳣
	public void dosome()throws Exception{
		 
	 }*/
}
