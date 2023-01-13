package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp1 {
@Autowired
@Qualifier("tempaddress1")
private Address address;

public Address getAddress() {
	return address;
}
//@Autowired
public void setAddress(Address address) {
	this.address = address;
}

public Emp1() {
	super();
	// TODO Auto-generated constructor stub
}
//@Autowired

public Emp1(Address address) {
	super();
	this.address = address;
}

//@Override
//@Qualifier("tempaddress1")
public String toString() {
	return "Emp1 [address=" + address + "]";
}




}
