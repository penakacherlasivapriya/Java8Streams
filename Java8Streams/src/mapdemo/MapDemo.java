package mapdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
	public static void main(String[] args) {
		List<String> vehicles = Arrays.asList("bus","car","bike","flight","train");
		List<String> vehiclesList = new ArrayList<>();
		
		for(String names: vehicles) {
			vehiclesList.add(names.toUpperCase());
		}
		System.out.println(vehiclesList);
		
	    vehiclesList= vehicles.stream().map(name-> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(vehiclesList);
	}

}
