package reservation;

public abstract class SalleCommune extends Salle{

	private String typeSalleCommune;
	
	public SalleCommune(int id, String name) {
		super(id, name);
		this.type = TypeSalle.SALLECOMMUNE;
	}

}
