package factory;

import abstractMethod.Car;
import abstractMethod.CarFactory;
import entities.ElectricCar;

public class ElectricCarFactory extends CarFactory<ElectricCar> {

	@Override
	public Car createCar(Long id, String name, String color, Integer year, String brand) {
		return new ElectricCar(id, name, color, year, brand);
	}

	@Override
	public String repairCar(ElectricCar car) {
		return car.repair();
	}
	
}
