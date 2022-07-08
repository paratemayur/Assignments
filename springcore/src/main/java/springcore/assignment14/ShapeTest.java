package springcore.assignment14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

		System.out.println("__________Rectangle__________");
		Rectangle rectangle = context.getBean("recID", Rectangle.class);
		System.out.println("Rectangle - Area : " + rectangle.area());
		System.out.println("Rectangle - Side : " + rectangle.side());

		System.out.println("\n____________Circle____________");
		Circle circle = context.getBean("cirID", Circle.class);
		System.out.println("Circle - Area : " + circle.area());
		System.out.println("Circle - radius : " + circle.side());

		System.out.println("\n____________Square____________");
		Square square = context.getBean("sqrID", Square.class);
		System.out.println("Square - Area : " + square.area());
		System.out.println("Square - side : " + square.side());

	}
}
