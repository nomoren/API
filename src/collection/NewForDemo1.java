package collection;
/**
 * JDK5�Ƴ�ʱ���Ƴ���һ�������ԣ�
 * ��ǿ��forѭ����Ҳ��Ϊ��ѭ����for each
 * ��ѭ����ȡ��ͳforѭ���Ĺ�������ר������������������ϻ��������
 * @author admin
 *
 */
public class NewForDemo1 {
	public static void main(String[] args) {
		String[] array={"one","two","three","four"};
		/*
		 * ��ѭ�����﷨Ҳ�Ǳ������Ͽɵģ�����������Ͽɡ����������ڱ���Դ����ʱ
		 * ����ѭ�����������Ϊ��ͳforѭ�������ķ�ʽ
		 */
		//����string���ͱ���str������array���ÿ��Ԫ��
		for(String str:array){
			System.out.println(str);
		}
	}
}
