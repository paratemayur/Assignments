package springcore.assignment15;

public class Item {
int id;
String iname;
int noi;
double iprice;
Category category;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getIname() {
	return iname;
}
public void setIname(String iname) {
	this.iname = iname;
}
public double getIprice() {
	return iprice;
}
public void setIprice(double iprice) {
	this.iprice = iprice;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}

public int getNoi() {
	return noi;
}
public void setNoi(int noi) {
	this.noi = noi;
}
@Override
public String toString() {
	return "Item [Item id=" + id + ", Item Name=" + iname + ", Number Of Item=" + noi + ", Item Price=" + iprice + ", Category Detail=" + category
			+ "]";
}


}
