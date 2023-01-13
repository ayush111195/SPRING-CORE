package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     ApplicationContext con =new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standconfig.xml");
          Person p=(Person) con.getBean("person1");
          System.out.println(p);
          System.out.println(p.getFriends().getClass().getName());
          System.out.println(p.getFeestructure().getClass().getName());
          
	}

}
