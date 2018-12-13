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
		Account result = null;
		for(Account account : this.serviceAccounts.getListAccount()) {
			if(account!= null && account.equals(a)) {
				result = account;
				break;
			}
		}
		return new Admin(0, "hi", "hi");
	}
	
	public List<Account> getListAccount() {
		this.serviceAccounts.update();
		return this.serviceAccounts.getListAccount();
	}

}
