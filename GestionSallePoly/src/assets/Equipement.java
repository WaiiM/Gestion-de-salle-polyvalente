package assets;

public abstract class Equipement {
	private int id;
	private String name;
	private boolean etat;

	public Equipement(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isEtat() {
		return etat;
	}


	public void setEtat(boolean etat) {
		this.etat = etat;
	}


	@Override
	public String toString() {
		StringBuffer str = new StringBuffer("#"+this.id+" "+this.name);
		return str.toString();
	}
}
