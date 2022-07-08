package springcore.assignment15;

public class Category {
int catid;
String catname;
public int getCatid() {
	return catid;
}
public void setCatid(int catid) {
	this.catid = catid;
}
public String getCatname() {
	return catname;
}
public void setCatname(String catname) {
	this.catname = catname;
}
@Override
public String toString() {
	return "Category [Category id=" + catid + ", Category Name=" + catname + "]";
}

}
