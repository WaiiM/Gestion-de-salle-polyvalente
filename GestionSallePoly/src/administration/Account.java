package administration;

public class Account {
	private int id;
	private String name;
	protected TypeAccount type;
	
	public Account(int id, String name) {
		this.id = id;
		this.name = name;
		this.type = TypeAccount.SECRETAIRE;
	}
}
