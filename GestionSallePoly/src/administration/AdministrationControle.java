package administration;


public class AdministrationControle {
	private GestionnaireAdministration ga;
	
	public AdministrationControle() {
		this.ga = new GestionnaireAdministration(this);
	}
	
	public Account connecter(Account account) {
		return ga.isExists(account);
	}
	public void addAccount(Account a) {
		this.ga.addAccount(a);
	}
	
	public void updateAccount() {
		
	}
	
	public void deleteAccount() {
		
	}
}
