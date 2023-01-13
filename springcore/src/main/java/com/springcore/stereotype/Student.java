package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //("ob") ab jo object banega wo camile case according nhi ob naam ka bnega 
@Scope("prototype")
public class Student {
	@Value("ayush gupta")
private String studentname;
	@Value("orai")
private String studentcity;
	@Value("#{address}")
	private List<String> address;	
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public String getStudentcity() {
	return studentcity;
}
public void setStudentcity(String studentcity) {
	this.studentcity = studentcity;
}


public List<String> getAddress() {
	return address;
}
public void setAddress(List<String> address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [studentname=" + studentname + ", studentcity=" + studentcity + "]";
}

}
