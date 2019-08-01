package exception;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * 重写超类含有throws声明异常抛出的方法时，对throws的重写规则
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
	/*允许抛出部分异常
	public void dosome()throws IOException{
		 
	 }*/
	
	/*允许抛出超类方法抛出的子类型异常
	public void dosome()throws FileNotFoundException{
		 
	 }*/
	
	/*不允许抛出额外异常
	public void dosome()throws SQLException{
		 
	 }*/
	
	/*不允许抛出超类方法抛出异常的父类异常
	public void dosome()throws Exception{
		 
	 }*/
}
