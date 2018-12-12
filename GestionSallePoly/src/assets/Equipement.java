package assets;

public abstract class Equipement {
	private int id;
	private String name;
	

	public Equipement(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer("#"+this.id+" "+this.name);
		return str.toString();
	}
}
