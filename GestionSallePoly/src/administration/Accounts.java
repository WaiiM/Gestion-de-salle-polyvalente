package administration;

import java.util.ArrayList;
import java.util.List;

import dao.DAO;

public class Accounts {
	private static DAO daoAccount;
	private List<Account> listAccount;
	
	public Accounts() {
		if(daoAccount == null) {
			daoAccount = new AccountDAO();
		}
		this.listAccount = new ArrayList<Account>();
	}
	
	public void init() {
		// recupérer la liste des reservations depuis le DAO
	}
	
	public Account getUneReservation() {
		// retouner une reservation donnée
		return null;
	}
	
	public void update() {
		// mettre à jour la liste des reservations depuis la BDD
	}
	
	
	public List<Account> getListAccount() {
		this.update();
		return listAccount;
	}
}
