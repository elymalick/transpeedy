package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Adresse implements Serializable {
	@Id
	private int IdAdresse;
	private int numeroRue;
	private String Rue;
	private String adresseComplementaire;
	private String codePostal;
	private String ville;
	private String pays;
	public int getIdAdresse() {
		return IdAdresse;
	}
	public void setIdAdresse(int idAdresse) {
		IdAdresse = idAdresse;
	}
	public int getNumeroRue() {
		return numeroRue;
	}
	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}
	public String getRue() {
		return Rue;
	}
	public void setRue(String rue) {
		Rue = rue;
	}
	public String getAdresseComplementaire() {
		return adresseComplementaire;
	}
	public void setAdresseComplementaire(String adresseComplementaire) {
		this.adresseComplementaire = adresseComplementaire;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	
	
	
}

