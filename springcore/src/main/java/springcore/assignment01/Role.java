package springcore.assignment01;

public class Role {

	private Role() {
		//System.out.println("private Constructor...!");
	}

	public static Role getRole() {

		//System.out.println("factory method...!");
		return new Role();
	}

	public void msg() {
		System.out.println("Role Based Object is Created");
	}
}
