package String;
/**
 * StringBuilder(�޸�����
 * )ר�������޸��ַ������ݵ�API
 * Strinf�������Ż�������⵼�µ�������ǲ���Ƶ���޸�
 * �޸�(ÿ�ζ������¶���
 * @author admin
 *
 */
public class StringBulider {
	public static void main(String[] args) {
		String str="Ŭ��ѧϰjava";
		StringBuilder bulider=new StringBuilder(str);
		//append(),ƴ���ַ���
		bulider.append("��Ϊ���ҵ��ù���");
		str=bulider.toString();
		System.out.println(str);
		System.out.println(str.substring(9,16));
		//replace(),��
		bulider.replace(9, 16, "�ı�����");
		System.out.println(bulider.toString());
		//delete()ɾ
		bulider.delete(0, 8);
		System.out.println(bulider.toString());
		//insert()����
		bulider.insert(0, "����");
		System.out.println(bulider.toString());
		
}
}
