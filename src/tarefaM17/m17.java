package tarefaM17;

import java.util.HashMap;
import java.util.Map;

import abstractClasses.Car;
import entities.Civic;
import entities.Golf;

public class m17 {
	
	public static void main(String[] args) {
		Map<Long,? extends Car> carList = new HashMap<>();
		Civic carCivic = new Civic("Civic turbinado", 2023, "Honda");
		Golf carGolf = new Golf("Golf sapão", 2012, "Volkswagen");
		
		Map<Long, Car> conretList = new HashMap<>();
		
		conretList.put(1L, carCivic);
		conretList.put(2L, carGolf);
		
		carList = conretList;
	}
}
