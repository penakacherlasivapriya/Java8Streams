package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctLimit {
	public static void main(String[] args) {
		
		List<String> vehicles = Arrays.asList("bus","car","bike","flight","car","bus","bycycle","bike");
		
		//distinct
		List<String> vehicle=vehicles.stream().distinct().collect(Collectors.toList());
	    System.out.println(vehicle);
	    //forEach
	    vehicles.stream().distinct().forEach(n->System.out.println(n));
	    //count
	    long count=vehicles.stream().distinct().count();
	    System.out.println(count);
	    //limit
	    List<String> limit= vehicle.stream().limit(3).collect(Collectors.toList());
	    System.out.println(limit);
	    }

}
