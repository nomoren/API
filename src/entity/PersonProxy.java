package entity;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import proxy.Person;



public class PersonProxy {
	private Person person;//要代理的对象
	public PersonProxy(Person person) {
		this.person=person;
	}
	public Person getUserProxy() {
		Person proxy=null;
		ClassLoader loader=person.getClass().getClassLoader();//要代理的对象是哪个类加载器加载的
		Class[] interfaces=new Class[] {Person.class};//代理对象的类型，即有哪些方法
		//当调用代理对象的方法时，要执行的代码
		InvocationHandler h=new InvocationHandler() {
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println(method.getName()+"方法执行之前。。。。");
				method.invoke(person, args);
				return 0;
			}
		};
		proxy=(Person) Proxy.newProxyInstance(loader, interfaces, h);
		return proxy;
	}
}
