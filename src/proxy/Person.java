package proxy;

import entity.PersonImpl;
import entity.PersonProxy;
import entity.User;

public interface Person {
	public void run(String name) ;
	public static void main(String[] args) {
		PersonImpl p=new PersonImpl();
		Person proxy=new PersonProxy(p).getUserProxy();
		proxy.run("mm");
	}
}
