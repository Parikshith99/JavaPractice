package com.java.oop3;

public class Composition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monitor monitor=new Monitor("12cv", "Acer", 10);
		BoxCase box=new BoxCase("234h", "Intel", "220");
		MotherBoard motherboard=new MotherBoard("etg4","Intel",4,5,"yun");
		Pc p=new Pc(box,monitor,motherboard);
		p.poweUp();

	}

}
