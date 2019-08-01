package text;

import java.util.Arrays;

public class Acount {
	public static void main(String[] args) {
		/*String line="ASAFDSAFDGFEDFDAEFAEAFEPOASFKGJZCMNVCBYH";
		int[] count=new int[26];
		for(int i=0;i<line.length();i++){
			count[line.charAt(i)-'A']++;
		}
		System.out.println(Arrays.toString(count));
	}*/
		String line="0121345567890";
		int[] count=new int[10];
		for(int i=0;i<line.length();i++){
			count[line.charAt(i)-'0']++;
		}
		System.out.println(Arrays.toString(count));
	}
	
}
