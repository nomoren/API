package collection;
/**
 * �����Ǳ������Ͽɣ����������
 * �������Ὣ���͸�Ϊobject�����Է���ʵ�����;���object
 * ��ʹ�÷���ʱ���������Ḩ������������
 * 1.�Է�������ֵʱ�������������ֵ�������Ƿ��뷺��һ�£���һ������벻ͨ��
 * 2.�ڻ�ȡ����ֵʱ��������������������͵Ĵ���
 * @author admin
 *
 */
public class TypeDemo2 {
	public static void main(String[] args) {
		Location< Integer> loc1=new Location<Integer>(2, 2);
		/*
		 * ����������ʵ�ʸ�ֵ�Ƿ���Ϸ�������Ҫ�󣬲����ϱ��벻ͨ��
		 */
		loc1.setX(1);
		//loc1.setX("1"); ���벻ͨ��
		/*���������ڱ���ʱ��ȫ�������͵Ĵ���Ϊ��
		int x1=(Integer)loc1.getX();
		Ȼ�󻹻ᴥ���Զ�����
		int x1=((Integer)loc1.getX()).intValue();*/
		
		int x1=loc1.getX();
		System.out.println("loc1"+loc1);
		System.out.println("x1"+x1);
		
		//���Ϳ��Բ�ָ������ָ������Ĭ�ϵ�
		Location loc2=loc1;
		System.out.println("loc2"+loc2);
		loc2.setX("��");
		System.out.println("loc2"+loc2);
		
		//��loca1�ĽǶȻ�ȡx
		x1=loc1.getX();
		/*int x1=(Integer)loc1.getX();
		int x1=((Integer)loc1.getX()).intValue();*/
		System.out.println(x1);//�������쳣
	}
}
