package administration;

import java.util.List;

public class GestionnaireAdministration {
	private AdministrationControle ac;
	private Accounts serviceAccounts;
	
	public GestionnaireAdministration(AdministrationControle ac) {
		this.ac = ac;
		this.serviceAccounts = new Accounts();
		this.serviceAccounts.init();
	}
	
	public Account isExists(Account a) {
	  AccountCourant account = new AccountCourant(a);
	  return account.verifierExistence();
	}
	
	public List<Account> getListAccount() {
		this.serviceAccounts.update();
		return this.serviceAccounts.getListAccount();
	}

}
