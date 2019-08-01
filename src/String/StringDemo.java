package String;

import java.util.Arrays;

/**
 * string是不变对象，jvm对其做了一个优化，在内存中开辟了一段区域作为常量池。
 * @author admin
 *
 */
public class StringDemo {
public static void main(String[] args) {
	String str="我爱  java";
	System.out.println(str.length());
	int []a={};
	a[0]=1;
	a[1]=2;
	/*int[] a1={1,2};
	int []a2=a1;
	System.out.println(a1==a2);
	a1=Arrays.copyOf(a1, a1.length+1);
	System.out.println(a1==a2);
	for(int i:a1){
		System.out.println(a1[i]);
	}*/
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
	}
	}


}
