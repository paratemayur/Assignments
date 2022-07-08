package springcore.assignment15;

public class Customer {

	int custid;
	String custname;
	Item item;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "Customer [Customer id=" + custid + ", Customer Name=" + custname + ", Item Details=" + item + "]";
	}
	
	public void display() {
		System.out.println("Category Deatils : "+item.category.toString());
		System.out.println("Item Details : "+item);
		System.out.println("Customer ID : "+custid);
		System.out.println("Customer Name : "+custname);
		System.out.println("Total Amount : "+item.noi*item.iprice);
		
	}
}
