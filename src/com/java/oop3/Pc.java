package com.java.oop3;

public class Pc {
   private BoxCase boxcase;
   private Monitor monitor;
   private MotherBoard motherboard;
  
public Pc(BoxCase boxcase, Monitor monitor, MotherBoard motherboard) {
	super();
	this.boxcase = boxcase;
	this.monitor = monitor;
	this.motherboard = motherboard;
}
public void poweUp() {
	   boxcase.power();
	   drawlogo();
	   motherboard.loadProgram();
   }
private void drawlogo() {
	monitor.pixel(10,20,"Blue");
	
}
   
}
