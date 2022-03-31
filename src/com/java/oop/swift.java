package com.java.oop;

public class swift extends Vehicle{
    private int speed;
    private String engineType;
	public swift(int engine, int wheels, String color, int speed, String engineType) {
		super(engine, wheels, color);
		this.speed = speed;
		this.engineType = engineType;
	}
    public void wheels() {
    	System.out.println(getWheels());
    	speed(10);
    }
    private void speed(int x) {
    	System.out.println("speed() called");
    	System.out.println("Speed is"+x);
    }
}
