package com.java.oop;

public class Vehicle {
   private int engine;
   private int wheels;
   private String color;
   
public Vehicle(int engine, int wheels, String color) {
	this.engine = engine;
	this.wheels = wheels;
	this.color = color;
}
public int getEngine() {
	return engine;
}
public void setEngine(int engine) {
	this.engine = engine;
}
public int getWheels() {
	return wheels;
}
public void setWheels(int wheels) {
	this.wheels = wheels;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}

   
}
