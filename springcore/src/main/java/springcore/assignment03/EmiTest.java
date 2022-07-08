package springcore.assignment03;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmiTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
	
		Emi emi = context.getBean("emiID", Emi.class);
		
		System.out.println("Intrest Rate : "+emi.rate + "%");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount : ");
		float amount = sc.nextFloat();
		
		System.out.println("Enter validity in Year : ");
		int validity = sc.nextInt();
		
		int validityInMonths = validity*12;
		
		double TPA = amount + ((amount * emi.rate)/100) * validity;
		System.out.println("Total payble amount : "+TPA);
		
		double emiPM = TPA/validityInMonths;
		System.out.println("Per Month payble amount : "+emiPM);
	
	}
}
