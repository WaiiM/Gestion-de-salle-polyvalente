package assets;

public class Service {
	public int id;
	public String name;
	
	public Service(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer("#"+this.id+" "+this.name);
		return str.toString();
	}
}
