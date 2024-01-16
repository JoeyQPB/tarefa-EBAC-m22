package entities;

import abstractMethod.Car;

public class HybridCar extends Car {

	public HybridCar(Long id, String name, String color, Integer year, String brand) {
		super(id, name, color, year, brand, "Hybrid");
	}

}
