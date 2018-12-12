package reservation;

import assets.*;
import java.util.*;

public class Reservation {
	private Occupant occupant;
	private List<Piece> listSalle;
	private List<Service> listSerivce;
	private List<Equipement> listEquipement;
	
	public Reservation(Occupant occ) {
		this.occupant = occ;
		this.listSalle = new ArrayList<Piece>();
		this.listSerivce = new ArrayList<Service>();
		this.listEquipement = new ArrayList<Equipement>();
	}

	public Occupant getOccupant() {
		return occupant;
	}

	public void setOccupant(Occupant occupant) {
		this.occupant = occupant;
	}

	public List<Piece> getListSalle() {
		return listSalle;
	}

	public void setListSalle(List<Piece> listSalle) {
		this.listSalle = listSalle;
	}

	public List<Service> getListSerivce() {
		return listSerivce;
	}

	public void setListSerivce(List<Service> listSerivce) {
		this.listSerivce = listSerivce;
	}

	public List<Equipement> getListEquipement() {
		return listEquipement;
	}

	public void setListEquipement(List<Equipement> listEquipement) {
		this.listEquipement = listEquipement;
	}
	
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer("Reservation:");
		str.append("\nOccupant: " +this.occupant);
		str.append("\nSalles reservées: ");
		for(Piece p : this.listSalle) {
			str.append(p+", ");
		}
		str.append("\nServices reservés: ");
		for(Service s : this.listSerivce) {
			str.append(s+", ");
		}
		str.append("\nEquipements reservés: ");
		for(Equipement e : this.listEquipement) {
			str.append(e+", ");
		}
		return str.toString();
	}
	
}
