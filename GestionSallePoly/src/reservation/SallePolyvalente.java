package reservation;

import java.util.*;
public class SallePolyvalente extends Piece{
	private List<Salle> listSalle;
	
	public SallePolyvalente(int id, String name, List<Salle> list) {
		super(id, name);
		this.listSalle = list;
		this.type = TypeSalle.POLYVALENTE;
	}
	
	public List<Salle> getListSalle(){
		return this.listSalle;
	}
	
}
