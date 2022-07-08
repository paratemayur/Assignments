package springcore.assignment02;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

public class AverageNum {

	List<Integer> num;

	@Override
	public String toString() {
		return "AverageNum [num=" + num + "]";
	}
	public List<Integer> getNum() {
		return num;
	}
	public void setNum(List<Integer> num) {
		this.num = num;
	}

	@PostConstruct
	public void avgNum() {
		Double avg = num.stream().collect(Collectors.averagingDouble(i -> i));
		System.out.println("Average of number : "+avg);
		
	}
	
	
	
}
