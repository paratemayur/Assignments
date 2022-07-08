package springcore.assignment13;

public class MovieSystem {

	String moviename;
	String showtime;
	float priceofticket;
	String moviecollection;
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getShowtime() {
		return showtime;
	}
	public void setShowtime(String showtime) {
		this.showtime = showtime;
	}
	public float getPriceofticket() {
		return priceofticket;
	}
	public void setPriceofticket(float priceofticket) {
		this.priceofticket = priceofticket;
	}
	public String getMoviecollection() {
		return moviecollection;
	}
	public void setMoviecollection(String moviecollection) {
		this.moviecollection = moviecollection;
	}
	
	public void display() {
		System.out.println("Movie Name : "+moviename);
		System.out.println("Show Time : "+showtime);
		System.out.println("Price of ticket : "+priceofticket);
		System.out.println("Movie Collection : "+moviecollection);
	}
}
