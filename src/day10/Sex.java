package day10;

public enum Sex {

	
	MAN("男"),
	WOMAN("女");
	
	
	private String desc;
	
	
	public String getDesc() {
		return desc;
	}


	private Sex(String desc) {
		
		this.desc=desc;
	}
	
}
