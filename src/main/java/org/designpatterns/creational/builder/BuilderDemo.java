package org.designpatterns.creational.builder;

public class BuilderDemo {

	public static void main(String[] args) {
		CarBuilder cb=new CarBuilder();
		cb.setCarName("BREZZA");
		cb.setCarModel("VDI");
		cb.setCarEngine("CRD");
		cb.setTire(4);
		Car c=cb.getCar();
		System.out.println("---->>"+c.getCarName());
		System.out.println("---->>"+c.getCarModel());
		System.out.println("---->>"+c.getCarEngine());
		System.out.println("---->>"+c.getTire());
	}

}
