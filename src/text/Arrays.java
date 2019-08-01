package text;

public class Arrays {
	public static void main(String[] args) {
		int[] arr={45,1,415,14,45,988,664,4,55,41};
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				int a=arr[j];
				if(arr[j]>arr[j+1]){
					arr[j]=arr[j+1];
					arr[j+1]=a;
				}
			}
		}
		System.out.println(java.util.Arrays.toString(arr));
	}
}
