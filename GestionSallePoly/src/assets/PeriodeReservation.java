package assets;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PeriodeReservation {
	
	private Date dateDebut;
	private Date dateFin;
	
	public PeriodeReservation(Date dateDebut2, Date dateFin2) {
		try {
			this.dateDebut = Utils.sdf.parse(dateDebut2);
			this.dateFin = Utils.sdf.parse(dateFin2);
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
