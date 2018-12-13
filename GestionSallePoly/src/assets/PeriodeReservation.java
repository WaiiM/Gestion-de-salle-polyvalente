package assets;

import java.text.ParseException;
import java.util.Date;

public class PeriodeReservation {
	
	private Date dateDebut;
	private Date dateFin;
	
	public PeriodeReservation(String dateDebut, String dateFin) {
		try {
			this.dateDebut = Utils.sdf.parse(dateDebut);
			this.dateFin = Utils.sdf.parse(dateFin);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}
	
	public boolean isIncluded(PeriodeReservation periode) {
	  if(this.getDateDebut().after(this.getDateFin())) return false;
	  if(periode.getDateDebut().after(periode.getDateFin())) return false;
		boolean result = false;
		if(this.getDateDebut().after(periode.getDateFin())) {
			result = true;
		}
		else if(this.getDateFin().before(periode.getDateDebut())){
			result = true;
		}
		return result;
	}
	
}
