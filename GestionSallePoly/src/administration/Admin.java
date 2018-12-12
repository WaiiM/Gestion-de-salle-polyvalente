package administration;

public class Admin extends Account{

	public Admin(int id, String name) {
		super(id, name);
		this.type = TypeAccount.ADMIN;
	}
}
