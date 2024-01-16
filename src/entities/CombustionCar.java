package entities;

import abstractMethod.Car;

public class CombustionCar extends Car {

	public CombustionCar(Long id, String name, String color, Integer year, String brand) {
		super(id, name, color, year, brand, "Combustion");
	}

}
