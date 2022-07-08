package springcore.assignment09;

public class DistanceCal {

	String fromcity;
	String tocity;
	double distance;
	public String getFromcity() {
		return fromcity;
	}
	public void setFromcity(String fromcity) {
		this.fromcity = fromcity;
	}
	public String getTocity() {
		return tocity;
	}
	public void setTocity(String tocity) {
		this.tocity = tocity;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	@Override
	public String toString() {
		return "DistanceCal [fromcity=" + fromcity + ", tocity=" + tocity + ", distance=" + distance + "]";
	}
	
}
