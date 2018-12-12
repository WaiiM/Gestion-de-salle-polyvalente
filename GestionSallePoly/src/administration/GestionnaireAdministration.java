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
	
	public void addAccount() {
		serviceAccounts.add();
	}
	
	public void updateAccount() {
		
	}
	public void deleteAccount() {
		
	}
	public List<Account> getListAccount() {
		this.serviceAccounts.update();
		return this.serviceAccounts.getListAccount();
	}

}
