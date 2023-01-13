package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifeconfig.xml");
//		Samosa s1=(Samosa) context.getBean("sa"); // yhan Abstract isleye lgaya gya h taki registerShutdownhook ka method mil paye
//		System.out.println(s1);                   
		context.registerShutdownHook();// isko call karene se dono method call ho jayenge..
//		System.out.println("+++++++++++++++++++++++++++++++++++++++");
//		Pepsi p=(Pepsi) context.getBean("p1");
//		System.out.println(p);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		water w=(water) context.getBean("w1");
		System.out.println(w);
	}

}
