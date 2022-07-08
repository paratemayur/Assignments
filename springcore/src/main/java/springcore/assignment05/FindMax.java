package springcore.assignment05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindMax {

	List<Integer> max;
	
	public List<Integer> getMax() {
		return max;
	}

	public void setMax(List<Integer> max) {
		this.max = max;
	}

	public void maxNum() {
		
//		List<Integer> list = Arrays.asList(76,67,87,78,98,89);
//		Integer i1 = list.stream().max((n1, n2)->n1.intValue() > n2.intValue()?1 : -1).get();
		
		int findMax = max.stream().max((m1, m2) -> m1.intValue() > m2.intValue()?1 : -1).get();
		System.out.println("Maximum of number : "+findMax);
	}
}
