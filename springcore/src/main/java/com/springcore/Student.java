package com.springcore;

public class Student {
private int StudentId;
private String StudentName;
private String StudentAddress;
public int getStudentId() {
	return StudentId;
}
public void setStudentId(int studentId) {
	this.StudentId = studentId;
}
public String getStudentName() {
	return StudentName;
}
public void setStudentName(String studentName) {
	this.StudentName = studentName;
}
public String getStudentAddress() {
	return StudentAddress;
}
public void setStudentAddress(String studentAddress) {
	this.StudentAddress = studentAddress;
}
public Student(int studentId, String studentName, String studentAddress) {
	super();
	this.StudentId = studentId;
	this.StudentName = studentName;
	this.StudentAddress = studentAddress;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentAddress=" + StudentAddress
			+ "]";
}

}
