package day15;

public class Goods implements Comparable{

	
	private int id;
	private String isbn;
	
	private String name;
	
	

	public Goods(int id, String isbn, String name) {
		
		this.id = id;
		this.isbn = isbn;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Object o) {
		
		return (this.id-((Goods)o).getId());
		
		//return -this.isbn.compareTo(((Goods)o).getIsbn());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+"-"+this.isbn+"-"+this.name;
	}
	
	
	
	
	
	
}
