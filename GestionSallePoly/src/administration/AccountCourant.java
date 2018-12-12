package administration;

import assets.PeriodeReservation;
import dao.SalleDAO;
import reservation.Salle;
import reservation.TypeSalle;

public class AccountCourant {
	private static AccountDAO daoAccount;
	private Account account;
	
	public AccountCourant(Account a) {
		if(daoAccount == null) {
			daoAccount = new AccountDAO();
		}
		this.account = a;
	}
	
	public void ajouter() {
		daoAccount.add(this.account);
	}
	
	public void update() {
		daoAccount.update(this.account);
	}
	
	public boolean verifierExistence() {
		boolean result = false;
		
		return result;
	}
}
