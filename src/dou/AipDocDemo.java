package dou;
/**
 * 文档注释只在三个地方使用
 * 类，方法，常量
 * 文档注释是功能级注释，用来说明类，方法或常量的设计意图及功能描述
 * 文档注释最终可以被javadoc命令生成手册
 * @author admin
 * @version 1.0
 * @see java.lang.String 
 * @since JDK 1.0
 *
 */
public class AipDocDemo {
	/**
	 * sayhello方法中的问候语
	 */
	public static final String INFO="你好";
	/**
	 * 为指定的用户添加问候语
	 * @param name 用户名 
	 * @return 问候
	 */
	public String sayHello(String name){
		return INFO+name;
	}
}
