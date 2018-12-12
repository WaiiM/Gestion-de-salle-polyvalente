package assets;

public abstract class Piece {
	
	private int id;
	private String name;
	
	public Piece(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer("#"+this.id+" "+this.name);
		return str.toString();
	}
}
