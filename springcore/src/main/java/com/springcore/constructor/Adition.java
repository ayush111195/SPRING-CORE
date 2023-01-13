package com.springcore.constructor;

public class Adition {
private int a;
private int b;
public Adition(int a, int b) {
	super();
	this.a = a;
	this.b = b;
	System.out.println("constructor:int,int");
}
public Adition(double a, double b) {
	super();
	this.a =(int) a;// this value of a is in int so we type casting in int
	this.b =(int) b;// this value of a is in int so we type casting in int
	System.out.println("constructor:double,double");
}
public Adition(String a, String  b) {
	super();
	this.a =Integer.parseInt(a);         // this value of a is in int so we type casting in int
	this.b =Integer.parseInt(b);           // this value of a is in int so we type casting in int
	System.out.println("constructor:String,String");
}
public void dosum()


{
	System.out.println("the value of a is="+this.a);
	System.out.println("the value of b is="+this.b);
	System.out.println("sum is="+this.a+this.b);
}
}
