package com.springcore.auto.wire;

public class Emp1 {
private Address address;

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public Emp1() {
	super();
	// TODO Auto-generated constructor stub
}

public Emp1(Address address) {
	super();
	this.address = address;
}

@Override
public String toString() {
	return "Emp1 [address=" + address + "]";
}




}
