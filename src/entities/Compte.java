package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Compte implements Serializable {
    @Id
	private int IdCompte;
	private Date	date;
	private Client	IdClient;
	public int getIdCompte() {
		return IdCompte;
	}
	public void setIdCompte(int idCompte) {
		IdCompte = idCompte;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Client getIdClient() {
		return IdClient;
	}
	public void setIdClient(Client idClient) {
		IdClient = idClient;
	}

}
