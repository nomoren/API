package text;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr={8,12,33,38,44,57,78,82,98};
		int index=Arrays.binarySearch(arr, 57);
		System.out.println(index);//�ҵ�����λ��
		index=Arrays.binarySearch(arr, 6);
		System.out.println(index);//�Ҳ�������-(�����)-1
	}
	
}
