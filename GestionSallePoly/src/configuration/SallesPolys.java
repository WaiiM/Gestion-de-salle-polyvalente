package configuration;

import java.util.ArrayList;
import java.util.List;

import dao.*;
import reservation.*;

public class SallesPolys {
	private static SallePolyvalenteDAO daoSAllePoly;
	private List<SallePolyvalente> listSallePoly;
	
	public SallesPolys() {
		if(daoSAllePoly == null) {
			daoSAllePoly = new SallePolyvalenteDAO();
		}
		this.listSallePoly = new ArrayList<SallePolyvalente>();
	}
	
	public void init() {
		// recupérer la liste des reservations depuis le DAO
	}
	
	public SallePolyvalente getSallePoly() {
		// retouner une reservation donnée
		return null;
	}
	
	public void update() {
		// mettre à jour la liste des reservations depuis la BDD
	}
	
	
	public List<SallePolyvalente> getListSalle() {
		this.update();
		return listSallePoly;
	}
}
