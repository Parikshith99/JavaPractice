package com.java.oop;

public class maruthi extends Vehicle{
	private int speed;
    private String engineType;
	public maruthi(int engine, int wheels, String color, int speed, String engineType) {
		super(engine, wheels, color);
		this.speed = speed;
		this.engineType = engineType;
	}
}
