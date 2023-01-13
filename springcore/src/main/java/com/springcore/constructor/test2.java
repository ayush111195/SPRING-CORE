package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ref.A;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/constructor/constconfig.xml");
		Person p=	(Person) context.getBean("person");
		System.out.println(p);
		Adition A=	(Adition) context.getBean("add");
		A.dosum();
	}

}
