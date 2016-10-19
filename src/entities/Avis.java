package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Avis implements Serializable{
	
	@Id
	private int IdAvis;
	private Client IdClientGP;
	private Trajet IdTrajet;
	private String commentaire;
	public int getIdAvis() {
		return IdAvis;
	}
	public void setIdAvis(int idAvis) {
		IdAvis = idAvis;
	}
	public Client getIdClientGP() {
		return IdClientGP;
	}
	public void setIdClientGP(Client idClientGP) {
		IdClientGP = idClientGP;
	}
	public Trajet getIdTrajet() {
		return IdTrajet;
	}
	public void setIdTrajet(Trajet idTrajet) {
		IdTrajet = idTrajet;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
}
