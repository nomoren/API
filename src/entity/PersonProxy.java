package entity;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import proxy.Person;



public class PersonProxy {
	private Person person;//Ҫ����Ķ���
	public PersonProxy(Person person) {
		this.person=person;
	}
	public Person getUserProxy() {
		Person proxy=null;
		ClassLoader loader=person.getClass().getClassLoader();//Ҫ����Ķ������ĸ�����������ص�
		Class[] interfaces=new Class[] {Person.class};//�����������ͣ�������Щ����
		//�����ô������ķ���ʱ��Ҫִ�еĴ���
		InvocationHandler h=new InvocationHandler() {
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println(method.getName()+"����ִ��֮ǰ��������");
				method.invoke(person, args);
				return 0;
			}
		};
		proxy=(Person) Proxy.newProxyInstance(loader, interfaces, h);
		return proxy;
	}
}
