package reservation;

public abstract class SalleCommune extends Salle{

	private String typeSalleCommune;
	
	public SalleCommune(int id, String name, SallePolyvalente salleP) {
		super(id, name, salleP);
		this.type = TypeSalle.SALLECOMMUNE;
	}

}
