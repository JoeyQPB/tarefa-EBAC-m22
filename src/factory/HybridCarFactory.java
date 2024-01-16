package factory;

import abstractMethod.Car;
import abstractMethod.CarFactory;
import entities.HybridCar;

public class HybridCarFactory extends CarFactory<HybridCar> {
 
	@Override
	public Car createCar(Long id, String name, String color, Integer year, String brand) {
		return new HybridCar(id, name, color, year, brand);
	}

	@Override
	public String repairCar(HybridCar car) {
		return car.repair();
	}

}
