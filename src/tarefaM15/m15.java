package tarefaM15;

import abstractMethod.Car;
import entities.CombustionCar;
import entities.ElectricCar;
import entities.HybridCar;
import factory.CombustionCarFactory;
import factory.ElectricCarFactory;
import factory.HybridCarFactory;

public class m15 {
	
	private static CombustionCarFactory combustionCarFactory = new CombustionCarFactory();
	private static ElectricCarFactory electricCarFactory = new ElectricCarFactory();
	private static HybridCarFactory hybridCarFactory = new HybridCarFactory();
	
	public static void main(String[] args) {
		combustionCarBusiness();
		electricCarBusiness();
		hybridCarBusiness();
	}

	private static void combustionCarBusiness() {
		Car combustionCar =  combustionCarFactory.createCar(01L, "Dodge Challenger", "Preta", 2022, "Dodge");
		System.out.println("## CombustionCar ##");
		System.out.println(combustionCarFactory.repairCar((CombustionCar) combustionCar));;
		System.out.println(combustionCar.toString());
		System.out.println();
	}

	private static void electricCarBusiness() {
		Car electricCar = electricCarFactory.createCar(01L, "CyberTruck", "Prata", 2024, "Tesla");
		System.out.println("## ElectricCar ##");
		System.out.println(electricCarFactory.repairCar((ElectricCar) electricCar));;
		System.out.println(electricCar.toString());
		System.out.println();
	}

	private static void hybridCarBusiness() {
		Car hybridCar = hybridCarFactory.createCar(01L, "Haval H6", "Branca", 2023, "GWM");
		System.out.println("## HybridCar ##");
		System.out.println(hybridCarFactory.repairCar((HybridCar) hybridCar));;
		System.out.println(hybridCar.toString());
		System.out.println();
	}

}
