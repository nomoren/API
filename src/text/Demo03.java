package text;

import java.util.Arrays;
import java.util.Random;

public class Demo03 {
	/**
	 * 从10000000万个数据中找出前100大的数据
	 */
	public static void main(String[] args) {
		Random r=new Random();
		int[] arr=new int[101];
		for(int i=0;i<10000000;i++){
			int n=r.nextInt();
			arr[0]=n;
			Arrays.sort(arr);                                               
		}
		for(int i=1;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
