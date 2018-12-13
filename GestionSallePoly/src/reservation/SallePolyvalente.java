package reservation;

import java.util.*;
public class SallePolyvalente extends Piece{
	private List<Salle> listSalle;
	
	public SallePolyvalente(int id, String name) {
		super(id, name);
		this.type = TypeSalle.POLYVALENTE;
		this.listSalle = new ArrayList<Salle>();
	}
	
	public void addSalle(Salle salle) {
	  this.listSalle.add(salle);
	}
	
	public List<Salle> getListSalle(){
		return this.listSalle;
	}
	
}
