package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DateColis implements Serializable{

	@Id
	private int IdDate ;
	private Date dateDepart;
	private Date dateArrivée;
	public int getIdDate() {
		return IdDate;
	}
	public void setIdDate(int idDate) {
		IdDate = idDate;
	}
	public Date getDateDepart() {
		return dateDepart;
	}
	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}
	public Date getDateArrivée() {
		return dateArrivée;
	}
	public void setDateArrivée(Date dateArrivée) {
		this.dateArrivée = dateArrivée;
	}

}
