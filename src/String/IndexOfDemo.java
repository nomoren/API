package String;

public class IndexOfDemo {
public static void main(String[] args) {
	String str="thinking in java";
	int index=str.indexOf("i");
	System.out.println(index);
	//ָ��λ�ÿ�ʼ����
	index=str.indexOf("i", 2);
	System.out.println(index);
	//�������һ�γ��ֵ�λ��
	index=str.lastIndexOf("in");
	System.out.println(index);
}
}
