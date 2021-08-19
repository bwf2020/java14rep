package day9;

public class User {

	
	
	private String name;

	public User(String name) {
		
		this.name=name;
		
	}

	@Override
	public String toString() {
		
		return this.name;
	}

	@Override
	public boolean equals(Object obj) {
	
		User u=(User) obj;
		return this.name.equals(u.name);
	}
	
	
	
	
	
}
