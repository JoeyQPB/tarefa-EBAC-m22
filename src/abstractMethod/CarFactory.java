package abstractMethod;

public abstract class CarFactory<T> {
	
	public abstract Car createCar(Long id, String name, String color, Integer year, String brand);
	
	public abstract String repairCar(T car);

}
