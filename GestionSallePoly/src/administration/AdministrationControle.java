package administration;


public class AdministrationControle {
	private GestionnaireAdministration ga;
	
	public AdministrationControle() {
		this.ga = new GestionnaireAdministration(this);
	}
	
	public Account connecter(Account account) {
		return ga.isExists(account);
	}
	public void addAccount() {
		this.ga.addAccount();
	}
//	
//	public void updateAccount() {
//		
//	}
//	
//	public void deleteAccount() {
//		
//	}
}
