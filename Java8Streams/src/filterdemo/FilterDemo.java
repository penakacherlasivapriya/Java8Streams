package filterdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
	public static void main(String[] args) {
		
		List<Integer> numberlist =Arrays.asList(10,15,20,25,50);
		List<Integer> evenNumbers = new ArrayList<Integer>();
		
		//without streams
		for(int n:numberlist) 
		{
			if(n%2==0)
				evenNumbers.add(n);
		}
		System.out.println("Even numbers without streams are: "+evenNumbers);
		//with streams
		evenNumbers =numberlist.stream().filter(n-> n%2==0).collect(Collectors.toList());
		System.out.println("Even numbers with streams are: "+evenNumbers);
		
		numberlist.stream().filter(n-> n%2==0).forEach(n->System.out.println(n));
		
		numberlist.stream().filter(n-> n%2==0).forEach(System.out::println);
	}

}
