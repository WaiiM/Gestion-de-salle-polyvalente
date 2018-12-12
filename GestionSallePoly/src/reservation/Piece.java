package reservation;

public abstract class Piece {
	
	private int id;
	private String name;
	protected TypeSalle type;
	
	public Piece(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public TypeSalle getType() {
		return type;
	}


	@Override
	public String toString() {
		StringBuffer str = new StringBuffer("#"+this.id+" "+this.name);
		return str.toString();
	}
}
