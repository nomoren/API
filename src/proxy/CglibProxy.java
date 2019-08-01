package proxy;

import java.lang.reflect.Method;

import entity.User;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy {

	private User user;
	
	public CglibProxy(User user) {
		this.user=user;
	}
	
	public User getProxyUser() {
		User userp=(User)Enhancer.create(user.getClass(), new MethodInterceptor() {
			
			@Override
			public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
				System.out.println("===========");
				arg1.invoke(user, arg2);
				return null;
			}
		});
		return userp;
	}
}
