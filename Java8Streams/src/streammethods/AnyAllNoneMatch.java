package streammethods;

import java.util.HashSet;
import java.util.Set;

public class AnyAllNoneMatch {
	public static void main(String[] args) {
		Set<String> fruits= new HashSet<>();
		fruits.add("One mango");
		fruits.add("One apple");
		fruits.add("Two mangoes");
		fruits.add("Three mangoes");
		fruits.add("Two apples");
		
		//anymatch
		boolean result=fruits.stream().anyMatch(value->{
			return value.startsWith("One");
		});
		
		System.out.println(result);//true
		
		//allMatch
		boolean result1=fruits.stream().allMatch(value->{
			                             return value.startsWith("One");
		});
		System.out.println(result1);//false
		
		//noneMatch
		boolean result2=fruits.stream().noneMatch(value->{
					                    return value.startsWith("One");
		});
	    System.out.println(result2);//false
	}

}
