package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
public class Demo {
	@Value("#{2+3+4}")  //oprators
private int x;
	@Value("#{12+13+24}")
private int y;
	@Value("#{ T(java.lang.Math).sqrt(25)}") //methods
private double z;	
@Value("#{T(java.lang.Math).E}") //variable 
private double e;
@Value("#{new java.lang.String('ayush')}") //creat new objects 
private String name;
@Value("#{8>3}")
private  boolean isactive;
	
	
	

public int getX() {
	return x;
}

public double getE() {
	return e;
}

public void setE(double e) {
	this.e = e;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

public double getZ() {
	return z;
}

public void setZ(double z) {
	this.z = z;
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isactive=" + isactive + "]";
}






}


