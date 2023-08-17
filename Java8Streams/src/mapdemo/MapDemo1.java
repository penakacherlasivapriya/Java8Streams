package mapdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,3,4,5);
		List<Integer> numbersList = new ArrayList<>();
		
		
		numbersList= numbers.stream().map(number-> number*2).collect(Collectors.toList());
		System.out.println(numbersList);
	}

}
