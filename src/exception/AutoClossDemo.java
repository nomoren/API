package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * jdk7以后推出了一个新特性：autoclose
 * 允许编译器在编译过程中自动处理诸如流的关闭工作
 * @author admin
 */
public class AutoClossDemo {
	public static void main(String[] args) {
		try(
				/*
				 * 实现了autocloseable接口的类可以在这里定义，编译器
				 * 最终会将代码改变，在finally中将其关闭
				 */
				FileOutputStream fos=new FileOutputStream("fos.data");
				){	
			fos.write(1);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
