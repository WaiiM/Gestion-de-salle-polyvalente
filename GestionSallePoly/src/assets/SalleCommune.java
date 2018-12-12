package assets;

public abstract class SalleCommune extends Salle{

	public SalleCommune(int id, String name) {
		super(id, name);
		this.type = TypeSalle.SALLECOMMUNE;
	}

}
