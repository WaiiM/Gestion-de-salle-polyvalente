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
	
	public boolean isExists(Account a) {
		boolean result = false;
		for(Account account : this.serviceAccounts.getListAccount()) {
			if(account!= null && account.equals(a)) {
				result = true;
				break;
			}
		}
		return result;
	}
	
	public List<Account> getListAccount() {
		this.serviceAccounts.update();
		return this.serviceAccounts.getListAccount();
	}

}
