package entities;

import abstractMethod.Car;

public class ElectricCar extends Car {

	public ElectricCar(Long id, String name, String color, Integer year, String brand) {
		super(id, name, color, year, brand, "Electric");
	}

}
