package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Min_Max_Reduce_toArray {
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> evenNumber =list.stream().filter(n-> n%2==0).collect(Collectors.toList());
		System.out.println(evenNumber);
		long noOfevenNumbers=evenNumber.stream().count();
		System.out.println(noOfevenNumbers);
		
		//min
		Optional<Integer> min= list.stream().min((val1,val2)->{
			                            return val1.compareTo(val2);
		});
		System.out.println(min.get());
		
		//max
		Optional<Integer> max= list.stream().max((val1,val2)->{
			return val1.compareTo(val2);
		});
		System.out.println(max.get());
		
		//reduce
		
		Optional<Integer> reduce= list.stream().reduce((a,b)->{
			                         return a+b;
		});
		System.out.println(reduce.get());
		
		//toArray
		
		Object arr[]=list.stream().toArray();
		System.out.println(arr.length);
		for(Object o:arr) {
			System.out.println(o);
		}
		
		
	}

}
