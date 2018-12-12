package administration;

public class Admin extends Account{

	public Admin(int id, String name, String password) {
		super(id, name, password);
		this.type = TypeAccount.ADMIN;
	}
}
