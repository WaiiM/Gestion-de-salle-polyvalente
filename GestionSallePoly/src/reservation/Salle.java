package reservation;

public class Salle extends Piece{
	
	private SallePolyvalente sallePolyv;
	
	public Salle(int id, String name, SallePolyvalente salleP) {
		super(id, name);
		this.type = TypeSalle.SALLE;
		sallePolyv = salleP;
	}

  public SallePolyvalente getSallePolyv() {
    return sallePolyv;
  }

  public void setSallePolyv(SallePolyvalente sallePolyv) {
    this.sallePolyv = sallePolyv;
  }
	
	

}
