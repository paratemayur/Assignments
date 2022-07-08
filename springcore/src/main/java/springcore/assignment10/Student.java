package springcore.assignment10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private HashMap<String, Integer> std;
	
	public Student() {
		super();
	}
	
	public Map<String, Integer> getStd() {

		System.out.println(std);
		System.out.println("Sort all Data by Value");
		Map<String, Integer> tempMap = std.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue , (e1, e2) -> e1, LinkedHashMap :: new));
		System.out.println(tempMap);
		return std;	
		
	}
	public void setStd(HashMap<String, Integer> std) {
		this.std = std;
		//HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
	}
	@Override
	public String toString() {
		return "Student [std=" + std + "]";
	}
}
