package day15;

public class User {

	
	public String name;

	@Override
	public int hashCode() {
		
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.name.equals(((User)obj).name);
	}


	
	
	
	
	
	
	
}
