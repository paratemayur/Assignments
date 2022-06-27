package com.yash.lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ItemQ16 {

	String iname;
	String category;
	double price;
	String date_of_manufacturing;
	String date_of_expiring;

	public ItemQ16(String iname, String category, double price, String date_of_manufacturing, String date_of_expiring) {
		super();
		this.iname = iname;
		this.category = category;
		this.price = price;
		this.date_of_manufacturing = date_of_manufacturing;
		this.date_of_expiring = date_of_expiring;
	}
}

class TestItemQ16 {

	public static void main(String[] args) {

		List<ItemQ16> list = new ArrayList<>();
		list.add(new ItemQ16("Britannian", "Biscuit", 150.0, "2022-06-15", "2022-07-28"));
		list.add(new ItemQ16("KitKat", "catburry", 100.0, "2022-06-10", "2022-08-20"));
		list.add(new ItemQ16("Vennela", "icecream", 80.0, "2022-06-05", "2022-07-10"));

		String yn;
		do {
			Scanner sc = new Scanner(System.in);

			System.out.println("what the basis of print (iname,category,price,dom,doe)");
			String on_the_basis = sc.next();

			int res;

			switch (on_the_basis) {
			case "iname":
				System.out.println("Enter Item");
				String iname = sc.next();

				List<ItemQ16> ilist = list.stream().filter(i1 -> i1.iname.equals(iname)).collect(Collectors.toList());

				for (ItemQ16 i : ilist) {
					System.out.println("name: " + i.iname + ", category: " + i.category + ", date of manufacturing: "
							+ i.date_of_manufacturing + ", date of expiring: " + i.date_of_expiring + ", price: "
							+ i.price);
				}
				break;

			case "category":
				System.out.println("Enter Category");
				String cat = sc.next();

				List<ItemQ16> clist = list.stream().filter(c1 -> c1.category.equals(cat)).collect(Collectors.toList());
				for (ItemQ16 c : clist) {
					System.out.println("name: " + c.iname + ", category: " + c.category + ", date of manufacturing: "
							+ c.date_of_manufacturing + ", date of expiring: " + c.date_of_expiring + ", price: "
							+ c.price);
				}
				break;

			case "price":
				System.out.println("Enter Price");
				double p = sc.nextDouble();

				List<ItemQ16> plist = list.stream().filter(p1 -> p1.price == p).collect(Collectors.toList());
				for (ItemQ16 p1 : plist) {
					System.out.println("name: " + p1.iname + ", category: " + p1.category + ", date of manufacturing: "
							+ p1.date_of_manufacturing + ", date of expiring: " + p1.date_of_expiring + ", price: "
							+ p1.price);

				}
				break;

			case "dom":
				System.out.println("Enter Date of Manufacturing: ");
				String dom1 = sc.next();

				List<ItemQ16> dlist = list.stream().filter(d1 -> d1.date_of_manufacturing.equals(dom1))
						.collect(Collectors.toList());
				for (ItemQ16 d1 : dlist) {
					System.out.println("name: " + d1.iname + ", category: " + d1.category + ", date of manufacturing: "
							+ d1.date_of_manufacturing + ", date of expiring: " + d1.date_of_expiring + ", price: "
							+ d1.price);

				}
				break;

			case "doe":
				System.out.println("Enter Date of expiring: ");
				String doe1 = sc.next();

				List<ItemQ16> doelist = list.stream().filter(d1 -> d1.date_of_expiring.equals(doe1))
						.collect(Collectors.toList());
				for (ItemQ16 d1 : doelist) {
					System.out.println("name: " + d1.iname + ", category: " + d1.category + ", date of manufacturing: "
							+ d1.date_of_manufacturing + ", date of expiring: " + d1.date_of_expiring + ", price: "
							+ d1.price);

				}
				break;

			default:
				System.out.println("invalid input...!");
				break;
			}
			
			System.out.println();
			System.out.println("Do you want to continue (Press y for Yes and n for No)");
			
			yn = sc.next();
		} while (yn.equals("y") || yn.equals("Y"));
	}
}
