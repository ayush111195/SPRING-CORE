package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/autoconfig.xml");
   Emp1 em =   (Emp1) context.getBean("emp1");
   System.out.println(em);
	}

}
