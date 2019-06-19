package org.designpatterns.creational.builder;

public class CarBuilder {

	private String carName;
	private String carModel;
	private String carEngine;
	private Integer tire;

	public CarBuilder setCarName(String carName) {
		this.carName = carName;
		return this;
	}

	public CarBuilder setCarModel(String carModel) {
		this.carModel = carModel;
		return this;
	}

	public CarBuilder setCarEngine(String carEngine) {
		this.carEngine = carEngine;
		return this;
	}

	public CarBuilder setTire(Integer tire) {
		this.tire = tire;
		return this;
	}
	
	public Car getCar() {
		return new Car(carName, carModel, carEngine, tire);
	}

}
