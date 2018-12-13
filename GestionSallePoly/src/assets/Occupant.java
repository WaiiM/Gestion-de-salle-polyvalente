package assets;

import reservation.TypeOccupant;

public class Occupant {
	private int id;
	private String name;
	private TypeOccupant type;
	
	
	
	public TypeOccupant getType() {
    return type;
  }


  public void setType(TypeOccupant type) {
    this.type = type;
  }


  public Occupant(int id, String name, TypeOccupant type) {
		this.id = id;
		this.name = name;
		this.type = type;
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


  @Override
	public String toString() {
		StringBuffer str = new StringBuffer("#"+this.id+" "+this.name);
		return str.toString();
	}
}
