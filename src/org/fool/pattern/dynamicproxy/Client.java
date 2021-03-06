package org.fool.pattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		Subject realSubject = new RealSubject();

		InvocationHandler handler = new DynamicSubject(realSubject);

		Class<?> classType = handler.getClass();

		Subject subject = (Subject) Proxy.newProxyInstance(classType.getClassLoader(),
				realSubject.getClass().getInterfaces(), handler);

		subject.request();
	}
}
