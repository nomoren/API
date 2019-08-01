package RAF;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * �޸��ǳ�
 * ����������Ҫ���û�����Ҫ�޸ĵ��û����Լ��µ��ǳ�
 * Ȼ���û��ǳƽ����޸Ĳ���
 * ��������û��������ڣ�����ʾ�޴��û�
 * 
 * 1.��ȡ�û��������ǳ�
 * 2.ʹ��raf��user.dat�ļ�
 * 3.ѭ��ÿ����¼
 * 		1.��ָ���ƶ���������¼�û�����λ��
 * 		2.��ȡ32�ֽڡ����û�����ȡ����
 * 		3.�ж��û��Ƿ����
 * 		4.���ǣ�ָ���ƶ���������¼�ǳƵ�λ�ã��޸�
 * 		5.�����ǡ�continue
 * 		�������һ�����أ����޸Ĺ��ǳƺ󣬸ı���ֵ��������ѭ����󣬸��ݿ��ص�ֵ���ж��Ƿ����޸���Ϣ������޴��û�
 * @author admin
 *
 */
public class UpdateDemo {
	public static void main(String[] args) throws IOException {
		System.out.println("�����û���");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		RandomAccessFile raf=new RandomAccessFile("user.dat","rw");
		int n=0;
		boolean on = false;
		for(int i=0;i<raf.length()/100;i++){
			raf.seek(100*i);
			byte[] data=new byte[32];
			raf.read(data);
			String username=new String(data,"UTF-8").trim();
			if(username.equals(name)){
				raf.seek(n+64);
				System.out.println("�������ǳ�");
				String newname=sc.nextLine();
				data=newname.getBytes("utf-8");
				data=Arrays.copyOf(data, 32);
				raf.write(data);
				System.out.println("�޸����");
				on=true;
				break;
			}else{
				n+=100;
				continue;
			}
			
		}
		if(!on){
			System.out.println("�޴��û�");
		}
		raf.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
