package com.java.oop;

public class democlasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Car hondacity=new Car();
       hondacity.setColor("white");
       hondacity.setFuelType("petrol");
       hondacity.setGearType("gearless");
       hondacity.setNoofWheels("Four");
       System.out.println("Color of the car is "+hondacity.getColor());
       System.out.println("geartype of the car is "+hondacity.getGearType());
       System.out.println("fueltype of the car is "+hondacity.getFuelType());
       System.out.println("No of wheels of the car is "+hondacity.getNoofWheels());
       
       Car swift=new Car();
       swift.setColor("white");
       swift.setFuelType("desiel");
       swift.setGearType("geared");
       swift.setNoofWheels("Four");
       System.out.println("Color of the car is "+swift.getColor());
       System.out.println("geartype of the car is "+swift.getGearType());
       System.out.println("fueltype of the car is "+swift.getFuelType());
       System.out.println("No of wheels of the car is "+swift.getNoofWheels());
       
	}

}
