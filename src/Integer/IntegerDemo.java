package Integer;
/**
 * ��װ��
 * ��װ����Ϊ�˽���������Ͳ���ֱ�Ӳ���������󿪷�������
 * ���������������͵İ�װ��̳���number�ࡣ
 * java.lang.number��һ�������࣬�����˼������󷽷���Ҫ���������͵İ�װ����Խ����ʾ������
 * �������������ͷ���
 * @author admin
 *
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//int d=1;
		/**
		 * תΪ��װ��
		 */
		//Integer i=new Integer(1);
		Integer i=Integer.valueOf(1);
		/**
		 * ת�ػ�������
		 */
		//d=i.intValue();
		System.out.println(i);
		System.out.println(i.doubleValue());
		/**
		 * �������͵İ�װ�ඨ������������
		 * MAX_VALUE
		 * MIN_VALUE
		 * ���ڱ�ʾ�ð�װ���Ӧ�Ļ������͵�ȡֵ��Χ
		 */
		int max=Integer.MAX_VALUE;
		
	}
}
