package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import entity.PersonImpl;
import entity.User;

/**
 * ������Ķ�̬����
 * @author ME
 *
 */
public class NoInterfaceProxy {
	public static void main(String[] args) {
		User user=new CglibProxy(new User()).getProxyUser();
		user.run();
	}
}
