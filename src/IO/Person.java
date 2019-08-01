package IO;

import java.io.Serializable;
import java.util.Arrays;

/**
 * ʹ�õ�ǰ��ʵ�����Զ������Ķ����д����
 * ��һ�����ʵ��ϣ�����Ա�������ж�д��������ʵ��Serializable
 * ��Ӧ����Ҳ����ʵ�ָýӿ�
 * @author admin
 *
 */
public class Person implements Serializable{
	/**
	 * ��һ����ʵ����Serializable�ӿں�Ҫ��Ӧ������һ������serialVersionUID�����л��汾��
	 * ���л��汾��Ӱ�췴���л��Ƿ�ɹ����������������ڽ��з����л�ʱ����ö����뵱ǰ��
	 * �İ汾�Ƿ�һ�£���һ�������л�ʧ�ܣ��׳��쳣
	 * һ������Խ��з����л���ԭ���Ƕ�Ӧ�����Խ��л�ԭ
	 * ������ǲ�����ð汾�ţ����������ڱ��뵱ǰ��ʱ���ݽṹ����һ���汾�ţ�����һ����ǰ
	 * �෢���ı䣬��ô�汾��һ����ı䣬������ǰ�Ķ���һ���ǲ����Է����л���
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private double salay;
	private String genger;
	//transient�ؼ������ε������ڶ������л�ʱ�ᱻ���ԡ����Բ���Ҫ�����Կ��Դﵽ�������������
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
