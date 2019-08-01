package text;

public class Demo04 {
	public static void main(String[] args) {
		new childern();
	}
}
class childern extends father{
	int a=5;
	public childern() {
		
	}
	public void test(){
		System.out.println(a);
	}
}
class father{
	int a=6;
	int b=7;
	public father() {
		test();
	}
	public void test(){
		System.out.println(a);
	}
}