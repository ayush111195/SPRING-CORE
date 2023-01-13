package com.springcore.constructor;

import java.util.List;

public class Person {
	private String name;
	private int personid;
	private Certi certi;
	private List<String>phones;
	public Person(String name, int personid, Certi certi,List<String>phones) {
		super();
		this.name = name;
		this.personid = personid;
		this.certi = certi;
		this.phones=phones;
	}
	@Override
	public String toString() {
		return this.name+":"+this.personid+"{"+this.certi.name+"}"+":"+this.phones;
	}

}
