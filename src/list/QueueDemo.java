package list;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.queue
 * queue�̳���collection
 * ����Ҳ���Ա���һ��Ԫ�أ����Ǵ�ȡԪ�ر�����ѭ�Ƚ��ȳ�ģʽ
 * ����ʵ���ࣺlinkedlist
 * @author admin
 *
 */
public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		/*
		 * offerʱ��Ӳ����������ĩβ׷��Ԫ��
		 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		System.out.println(queue);
		/*
		 * poll�����ǳ��Բ�������ȡ��Ԫ�غ��Ԫ�ؼ��Ӷ����б�ɾ��
		 */
		String str=queue.poll();
		System.out.println(queue);
		System.out.println(str);
		/*
		 * peek�����ö���Ԫ�أ�Ԫ�ز������Բ���
		 */
		str=queue.peek();
		System.out.println(str+queue);
		/*
		 * ʹ�õ�����������Ԫ�ز���Ӷ�����ɾ��
		 */
		/*for(String s:queue){
			System.out.println(s);
		}*/
		
		/*
		 * ʹ��poll��������
		 */
		for(int i=queue.size();i>0;i--){
			String s=queue.poll();
			System.out.println(s);
		}
	}
}
