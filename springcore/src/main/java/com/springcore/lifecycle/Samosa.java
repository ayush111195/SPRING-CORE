package com.springcore.lifecycle;

public class Samosa {
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Samosa() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Samosa [price=" + price + "]";
}
public void hey() {
	System.out.println("inside init method");
}
public void bey() {
	System.out.println("inside destroy method");
}
}
