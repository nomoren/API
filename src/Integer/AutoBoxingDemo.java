package Integer;
/**
 * jdk1.5�汾�Ƴ���һ�����ԣ�
 * �Զ���װ��
 * �������Ǳ������Ͽɵġ�
 * @author ������_Xiloer
 *
 */
public class AutoBoxingDemo {
	public static void main(String[] args) {
		int d=new Integer(1);
		Integer a=new Integer(1);
		a=a.intValue();
	//int d=new Integer(1).intValue();
		Integer i=1;
	   //Integer i=Integer.valueOf(1);
	   System.out.println(i);
	   
	}
}
