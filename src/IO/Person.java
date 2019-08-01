package IO;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 使用当前类实例测试对象流的对象读写操作
 * 当一个类的实例希望可以被对象进行读写，该类需实现Serializable
 * 对应的类也必须实现该接口
 * @author admin
 *
 */
public class Person implements Serializable{
	/**
	 * 当一个类实现了Serializable接口后，要求应当定义一个常量serialVersionUID，序列化版本号
	 * 序列化版本号影响反序列化是否成功。当对象输入流在进行反序列化时会检查该对象与当前类
	 * 的版本是否一致，不一致则范序列化失败，抛出异常
	 * 一致则可以进行反序列化，原则是对应的属性进行还原
	 * 如果我们不定义该版本号，编译器会在编译当前类时根据结构生成一个版本号，但是一旦当前
	 * 类发生改变，那么版本号一定会改变，这样以前的对象一定是不可以反序列化了
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private double salay;
	private String genger;
	//transient关键字修饰的属性在对象序列化时会被忽略。忽略不必要的属性可以达到对象瘦身的作用
	private transient String[] otherInfo;
	public String[] getOtherInfo() {
		return otherInfo;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGenger() {
		return genger;
	}

	public void setGenger(String genger) {
		this.genger = genger;
	}

	public void setOtherInfo(String[] otherInfo) {
		this.otherInfo = otherInfo;
	}

	public String toString(){
		return name+","+genger+","+Arrays.toString(otherInfo)+","+salay;
	}
}
