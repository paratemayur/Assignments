package springcore.assignment09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DistanceCalTest {

	public static void main(String[] args) {
		
		List<DistanceCal> dclist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		DistanceCal distanceCal1 = context.getBean("dis1ID", DistanceCal.class);
		DistanceCal distanceCal2 = context.getBean("dis2ID", DistanceCal.class);
		DistanceCal distanceCal3 = context.getBean("dis3ID", DistanceCal.class);
		DistanceCal distanceCal4 = context.getBean("dis4ID", DistanceCal.class);
		DistanceCal distanceCal5 = context.getBean("dis5ID", DistanceCal.class);
		
		dclist.add(distanceCal1);
		dclist.add(distanceCal2);
		dclist.add(distanceCal3);
		dclist.add(distanceCal4);
		dclist.add(distanceCal5);
		
		System.out.println("Enter From City name : ");
		String fromCity = sc.next();
		
		System.out.println("Enter to city name : ");
		String toCity = sc.next();
		
		List<DistanceCal> list = dclist.stream().filter(dc -> dc.getFromcity().equalsIgnoreCase(fromCity)).filter(dc -> dc.getTocity().equalsIgnoreCase(toCity)).toList();
		
		if (!list.isEmpty()) {
			for(DistanceCal distanceCal : list) {
				System.out.println("distance between : "+distanceCal.getFromcity()+" To "+distanceCal.getTocity()+" is "+distanceCal.getDistance()+"KM");
			}
		}else {
			System.out.println("invalid data...!");
		}
	}
}
