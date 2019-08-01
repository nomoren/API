package reflectDemo;
/**
 * ≤‚ ‘∑¥…‰
 * @author admin
 *
 */
public class Person {
	int i;
	public Person(int i){
		this.i=i;
	}
	public Person(){
		}
	public void saiHello(){
		System.out.println("Hello");
	}
	public void saiHello(String name){
		System.out.println("Hello"+name);
	}
	public void saiHello(String name,int age){
		System.out.println("Hello"+name+age);
	}
	public void saiHai(){
		System.out.println("Hi");
	}
}
