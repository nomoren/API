package map;
/**
 * hashmap�ǲ�ѯ�ٶ��������ݽṹ���ڲ�ʹ������ʵ�֣���ͨ��key��hashcodeֵ����
 * ��Ԫ���������е��±�λ�ã��Ӷ������˱���Ԫ�صĲ���������Ԫ�ص�����Ӱ��
 * 
 * ����key��hashcode��������������hashmap�ڲ������λ�ã���equles����������key�Ƿ��ظ���
 * ֱ��Ӱ��hashmap�Ƿ����������Դ�����������object��������ȷ����д˵��
 * 
 * ��һ��hashmap�ڲ���������ʱ����������ѯ���ܣ�Ӧ���������⡣�����������������ڣ�
 * ������key��hashcodeֵ��ͬ��e��equals�Ƚϲ�Ϊtrueʱ�ͻ��γ�
 * 
 * API�ֲ�����object����˵������������������д����
 * 1.�ɶ���д
 * 		��������Ҫ��дһ��equals����ʱ����Ӧ����ͬhashcodeһ����д
 * 2.һ����
 * 		�����������equals�Ƚ�Ϊtrueʱ��hashcode�������ص����ֱ�����ͬ����֮���Ǳ���ģ�����
 * Ӧ��������֤��������hashcodeֵ��ͬʱequals�����Ƚ�Ϊtrue��������hashmap����Ϊkeyʱ���������
 * 3.�ȶ��ԣ���һ���������equals�Ƚϵ�����ֵû�з����ı��ǰ���£���ε���hashcode�������ص�����
 * Ӧ����ͬ
 * @author admin
 *
 */
public class Key {
	private int x;
	private int y;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
