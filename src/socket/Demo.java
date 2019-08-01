package socket;

import java.util.Arrays;

/***
 * 测试删除数组元素的逻辑
 * @author admin
 *
 */
public class Demo {
	public static void main(String[] args) {
		int[] allOut={1,2,3,4,5,6,7,8,9};
		int pw=3;

		for(int i=0;i<allOut.length;i++){
			if(allOut[i]==pw){
				allOut[i]=allOut[allOut.length-1];
				allOut=Arrays.copyOf(allOut, allOut.length-1);
				break;
			}
		}
		for(int i:allOut) {
			System.out.println(i);
		}
		
	}
}
