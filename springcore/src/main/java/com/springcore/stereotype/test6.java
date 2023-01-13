package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
	 Student s= (Student) con.getBean("student");
	 System.out.println(s);
	 System.out.println(s.getAddress());
	 
	 
	 System.out.println(s.hashCode());            // pehle object ka hascode
	 Student s1=(Student) con.getBean("student");
	 System.out.println(s1.hashCode());           // dusre object ka hascode
	 
	 // yhan "singleton scop h--->> humne container se obj manga usne 
	 //jo object bna kr rakhha h wahi de diya --->    jab container se fher se object ke leye 
	 // bola to usne fher se pehle wala hi object de diya "
	 
	 // humne @component ke neche 
	 //@scop("prototype") scope declear kar diya h isleye ioc ab har baar nya obj bnayega
	 //aur uska hascode bhi alg hoga 
	 
	 
	 // agr hum koi scop declear na kare to bydefault singleton hoga 
	 
	 Teacher t=(Teacher) con.getBean("teacher");
	 Teacher t2=(Teacher) con.getBean("teacher");
	 System.out.println(t.hashCode());
	 System.out.println(t2.hashCode());
	}

}
