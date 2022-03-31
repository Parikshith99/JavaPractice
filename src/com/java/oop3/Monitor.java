package com.java.oop3;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    
	public Monitor(String model, String manufacturer, int size) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
	}

	public void pixel(int x,int y,String color) {
		System.out.println("logo drawn");
		
	}

}
