package org.designpatterns.creational.builder;

public class Car {

	private String carName;
	private String carModel;
	private String carEngine;
	private Integer tire;

	public Car(String carName, String carModel, String carEngine, Integer tire) {
		super();
		this.carName = carName;
		this.carModel = carModel;
		this.carEngine = carEngine;
		this.tire = tire;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarEngine() {
		return carEngine;
	}

	public void setCarEngine(String carEngine) {
		this.carEngine = carEngine;
	}

	public Integer getTire() {
		return tire;
	}

	public void setTire(Integer tire) {
		this.tire = tire;
	}

}
