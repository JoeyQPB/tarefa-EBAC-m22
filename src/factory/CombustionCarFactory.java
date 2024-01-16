package factory;

import abstractMethod.Car;
import abstractMethod.CarFactory;
import entities.CombustionCar;

public class CombustionCarFactory extends CarFactory<CombustionCar> {

	@Override
	public Car createCar(Long id, String name, String color, Integer year, String brand) {
		return new CombustionCar(id, name, color, year, brand);
	}

	@Override
	public String repairCar(CombustionCar car) {
		return car.repair();
	}

}
