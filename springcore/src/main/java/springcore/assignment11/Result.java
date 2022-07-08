package springcore.assignment11;

public class Result {
	float maths,hindi,english, science, total_marks;

	public Result(float maths, float hindi, float english, float science) {
		super();
		this.maths = maths;
		this.hindi = hindi;
		this.english = english;
		this.science = science;
		this.total_marks = maths+hindi+english+science;
	}
	
	@Override
	public String toString() {
		return "Result [maths=" + maths + ", hindi=" + hindi + ", english=" + english + ", science=" + science
				+ ", total_marks=" + total_marks + "]";
	}
}
