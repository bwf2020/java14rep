package day10;

public enum Color2 {

	
	RED("red"),
	GREEN("green"),
	BLUE("blue"),
	BLACK,
	
	YELLOW("yellow","黄色");
	
	
	private String desc;
	private String desc2="";
	
	
	
	public String getDesc() {
		return desc;
	}

	private Color2() {
		
		
	}
	
	private Color2(String desc) {
		
		this.desc=desc;
		System.out.println("构造了："+desc);
	}
	
	private Color2(String desc,String desc2) {
		
		this.desc=desc;
		this.desc2=desc2;
		
	}

	@Override
	public String toString() {
	
		if(desc==null) {
			return name();
		}
		return desc+desc2;
		
		
	}
	
	
	
	
}
