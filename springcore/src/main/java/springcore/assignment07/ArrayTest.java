package springcore.assignment07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArrayTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Array1 array1 = context.getBean("arr1ID", Array1.class);
		
		Array2 array2 = context.getBean("arr2ID", Array2.class);
		
		//print Array 1
		array1.displayArr1();
		
		//Print Array 2
		array2.displayArr2();
		
		//Merge Array1 + Array2 and Print maximum number of array
		array1.mergeArray();
		
		
	}
}
