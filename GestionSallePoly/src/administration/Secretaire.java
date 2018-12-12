package administration;

public class Secretaire extends Account {
	
	public Secretaire(int id, String name, String password) {
		super(id, name, password);
		this.type = TypeAccount.SECRETAIRE;
	}
}
