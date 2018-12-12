package administration;

public class Account {
	private int id;
	private String name;
	private String password;
	protected TypeAccount type;
	
	public Account(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.type = TypeAccount.SECRETAIRE;
	}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public TypeAccount getType() {
		return type;
	}



	public void setType(TypeAccount type) {
		this.type = type;
	}

	

	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public boolean equals(Object account) {
	    if (account == null) return false;
	    if (account == this) return true;
	    if (!(account instanceof Account))return false;
	    Account accountCast = (Account) account;
	    if(this.getName().equals(accountCast.getName())) {
	    	if(this.getPassword().equals(accountCast.getPassword())) {
	    		if(this.getType().equals(accountCast.getType())) {
	    			return true;
	    		}
	    	}
	    }
	    return false;
	}
}
