package abstractClasses;

import java.util.Objects;

public class Car {
	
	private String name;
	private Integer year;
	private String brand;
	
	public Car(String name, Integer year, String brand) {
		super();
		this.name = name;
		this.year = year;
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", year=" + year + ", brand=" + brand + "]";
	}
	
}
