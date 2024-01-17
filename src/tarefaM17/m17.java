package tarefaM17;

import java.util.HashMap;
import java.util.Map;

import abstractClasses.Car;
import entities.Civic;
import entities.Golf;

public class m17 {
	
	public static void main(String[] args) {
		Map<Long, Car> carList = new HashMap<>();
		Civic carCivic = new Civic("Civic turbinado", 2023, "Honda");
		Golf carGolf = new Golf("Golf sapão", 2012, "Volkswagen");
		
		carList.put(1L, carCivic);
		carList.put(2L, carGolf);
	}
}
