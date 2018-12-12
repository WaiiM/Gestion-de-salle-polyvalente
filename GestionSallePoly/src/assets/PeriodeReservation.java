package assets;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PeriodeReservation {
	
	private Date dateDebut;
	private Date dateFin;
	
	public PeriodeReservation(String dateDebut, String dateFin) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.dateDebut = sdf.parse(dateDebut);
			this.dateFin = sdf.parse(dateFin);
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
	
	
}
