package reflectDemo;

import java.util.Arrays;

/**
 * jdk5֮���˳���һ��������
 * �ɱ����
 * һ�������пɱ����ֻ��һ������������棬���ٸ���������
 * @author admin
 *
 */
public class ArgDemo {
	public static void main(String[] args) {
		dosome("a");
		dosome("a","b");
		dosome("a","b","c");
	}
	public static void dosome(String...s){
		System.out.println("������ʼ");
		System.out.println(s.length);
		System.out.println(Arrays.toString(s));
		System.out.println("��������");
	}
	public static void dosome(int i,String...s){
		
	}
}
