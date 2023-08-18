package streammethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethod {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(5,6,7,2,3,9,1,4,10,8);
		//ascending order
		List<Integer> sortedlist=list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedlist);
		//descending order
		List<Integer> reversesortedlist=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reversesortedlist);
		
		//ascending order
		List<String> stringList=Arrays.asList("priya","anvika","bindu");
		List<String> ascedingnames=stringList.stream().sorted().collect(Collectors.toList());
		System.out.println(ascedingnames);
		//descending order
		List<String> descedingnames=stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(descedingnames);
	}

}
