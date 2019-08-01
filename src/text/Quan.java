package text;

public class Quan {
	public static void main(String[] args) {
		String num="123";//1*7-2+2*7-1+3*7-0
		int weight=1;
		int base=7;
		int sum=0;
		for(int i=num.length()-1;i>=0;i--){
			sum+=(num.charAt(i)-'0')*weight;
			weight*=base;
			
		}
		System.out.println(sum);
	}
}
