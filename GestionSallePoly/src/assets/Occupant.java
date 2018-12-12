package assets;

public class Occupant {
	private int id;
	private String name;
	
	public Occupant(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer("#"+this.id+" "+this.name);
		return str.toString();
	}
}
