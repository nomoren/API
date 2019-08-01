package nio;

import java.nio.ByteBuffer;

import org.junit.Test;

/**
 * buffer ��nio�и����ȡ���ݣ������������Ͳ�ͬ���ж�Ӧ��buffer(charbuffer,intbuffer,bytebuffer...)
 * buffer���ĸ���Ҫ���ԣ�
 *  mark = -1; ��¼position��λ�ã���ͨ��reset�����ص�mark��λ�ã�����ͨ��mark()���position��λ��
    position = 0;buffer�����ڲ������ݵ�λ��
    limit ���� ��ʾbuffer�п��Բ������ݵĴ�С��limit����������ǲ��ܶ�д��
    capacity ��������ʾbuffer���������
 * @author ME
 *
 */
public class Buffer {
	public static void main(String[] args) {
		ByteBuffer byteBuffer=ByteBuffer.allocate(1024);//����һ��1024�ֽڵ�byteBuffer
		byteBuffer.put("abc".getBytes());//put �������ݵ�buffer�У���ʱpositionΪ3��limitΪ1024
		byteBuffer.flip();//�л�Ϊ������ģʽ����ʱpositionΪ0��limitΪ3����Ϊ��ʱbuffer��ֻ�С�abc��,�ɲ�����ΧΪ����Ϊ3��
		byte[] b=new byte[byteBuffer.limit()];
		byteBuffer.get(b);//position 3��limit 3 
		System.out.println(new String(b));
		byteBuffer.rewind();//�ظ���  position�ص�0,�ظ���
		byteBuffer.clear();//���buffer����������Ȼ�ڣ����ݴ��ڱ�����״̬
	}
	@Test
	public void text() {
		ByteBuffer byteBuffer=ByteBuffer.allocate(1024);
		byteBuffer.put("abcde".getBytes());
		byteBuffer.flip();
		byte[] b=new byte[byteBuffer.limit()];
		byteBuffer.get(b,0,2);
		System.out.println(new String(b));
		byteBuffer.mark();//��Ǵ�ʱposition��λ�ã�2
		byteBuffer.get(b,2,2);//��ʱ��position 4
		System.out.println(new String(b,2,2));
		byteBuffer.reset();//�ص�marketλ�ã�2
		
		if(byteBuffer.hasRemaining()) {//buffer���Ƿ��пɲ�������
			System.out.println(byteBuffer.remaining());//���ж���
		}
	}
	
	@Test
	public void text1() {
		//ֱ�ӻ�������ͨ��allocate() ��������buffer������jvm��
		//��ֱ�ӻ�������ͨ�� allocateDirect()��������buffer�����ڲ���ϵͳ�������ڴ��У��������Ч��
	}
	
	
	
	}
