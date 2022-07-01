package com.yash.tdd.Assignments.Q15;

import java.time.LocalDate;

public class Item {

	int itemid;
	String itemname;
	int costprice;
	int sellprice;
	LocalDate dom;
	LocalDate doe;
	public Item(int itemid, String itemname, int costprice, int sellprice, LocalDate dom, LocalDate doe) {
		super();
		this.itemid = itemid;
		this.itemname = itemname;
		this.costprice = costprice;
		this.sellprice = sellprice;
		this.dom = dom;
		this.doe = doe;
	}
	
	Item i = null;
	
	public static boolean createObject(Item i) {
		if(countDigit(i.itemid) >= 3)
			   if (i.itemname.matches("[a-za-Z]-"))
		           if (i.sellprice>0 && i.costprice>0)
		           if(i.doe!=LocalDate.now())
		               if(i.sellprice!=i.costprice)
		            	   i = new Item(i.itemid, i.itemname, i.costprice, i.sellprice, i.dom, i.doe);
		   if(i!=null)
               return true;
           else 
               return false;

	}
	
	  public static int countDigit (int itemid) {
	        int count=0;
	        while(itemid>0) {
	            count++;
	            itemid/=10;
	        }
	        return count;
	    }
	   public static void main(String[] args) {
	        Item i = new Item (1,"Parle-G", 45,55,LocalDate.of(2022,06,22),LocalDate.of(2022, 07, 05));
	        System.out.println(Item.createObject(i));

	    }
}
