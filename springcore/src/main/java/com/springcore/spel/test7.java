package com.springcore.spel;

import java.beans.Expression;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
	    Demo d=(Demo) con.getBean("demo");
	    System.out.println(d);
	    
	    //SpelExpressionParser temp=  new SpelExpressionParser();
	    //Expression expr=  (Expression) temp.parseExpression("#{22+44}");
	   
    	//System.out.println(expr.execute());
		
	}

}
