package text;

public class Demo05 {
 public static void main(String[] args) {
	Demo05 d=new sub();
	d.text();
}
  private void text(){
	  System.out.println("a");
  }
}
class sub extends Demo05{
	public void text(){
		  System.out.println("b");
	  }
}
