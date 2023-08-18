package flatmapdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2);
		List<Integer> list2 = Arrays.asList(3,4);
		List<Integer> list3 = Arrays.asList(5,6);
		
		List<List<Integer>> finalList = Arrays.asList(list1, list2,list3);
		
		for(List<Integer> in:finalList) {
			for(int a:in) {
				System.out.println(a+10);
			}
		}
		
		List<Integer> list= finalList.stream().flatMap(x->x.stream().map(n->n+10)).collect(Collectors.toList());
		System.out.println(list);
		
	}

}
