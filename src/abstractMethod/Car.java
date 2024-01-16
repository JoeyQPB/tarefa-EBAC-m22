package abstractMethod;

import java.util.Objects;

public abstract class Car {

	private Long id;
	private String name;
	private String color;
	private Integer year;
	private String brand;
	private String model;
	
	public Car(Long id, String name, String color, Integer year, String brand, String model) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.year = year;
		this.setBrand(brand);
		this.model = model;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public String repair() {
		return "O carro: " + name + ", ano: " + year + ", marca: " + brand + ", modelo: " + model + ", foi consertado";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", color=" + color + ", year=" + year + ", brand=" + brand + ", model=" + model + "]";
	}

}
