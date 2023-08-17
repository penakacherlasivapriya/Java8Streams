package filterdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemoString {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Siva","priya","bindu","priyapriya","sivasiva");
		List<String> namesList = new ArrayList<>();
		namesList=names.stream().filter(str-> str.length()>4 && str.length()<6).collect(Collectors.toList());
		System.out.println(namesList);
	}

}
