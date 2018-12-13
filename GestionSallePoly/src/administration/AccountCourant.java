package administration;

import dao.AccountDAO;

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
	
	public Account verifierExistence() {
		if(this.account == null) return null;
		return (daoAccount.getAccount(this.account));
	}
}
