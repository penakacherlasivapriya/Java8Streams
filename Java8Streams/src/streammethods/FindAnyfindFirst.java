package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyfindFirst {
	public static void main(String[] args) {
		List<String> list= Arrays.asList("one","two","three");
		List<String> list1= Arrays.asList();
		
		Optional<String> findAny=list.stream().findAny();
		System.out.println(findAny.get());//one
		
		//Optional<String> findAny1=list1.stream().findAny();
		//System.out.println(findAny1.get());//NoSuchElementException
		
		Optional<String> findfirst=list.stream().findFirst();
		System.out.println(findfirst.get());//one
		
	}

}
