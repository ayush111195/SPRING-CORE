package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class water {
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public water() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "water [price=" + price + "]";
}
@PostConstruct
public void start()
{
	System.out.println("starting method");
}
@PreDestroy
public void end()
{
	System.out.println("ending method");
}
}
