package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trajet implements Serializable{
	@Id
	private int IdTrajet;
	private int IdClientGP;
	private DateColis IdDate;
	private ModeEnvoi IdModeEnvoi	;
	private List<Colis> IdColis	;
	private Ville IdVilleDepart;
	private Ville IdVilleArrivee;
	private String nombreKilosDispo	;
	private Double prixParKilo;
	private String description;
	public int getIdTrajet() {
		return IdTrajet;
	}
	public void setIdTrajet(int idTrajet) {
		IdTrajet = idTrajet;
	}
	public int getIdClientGP() {
		return IdClientGP;
	}
	public void setIdClientGP(int idClientGP) {
		IdClientGP = idClientGP;
	}
	public DateColis getIdDate() {
		return IdDate;
	}
	public void setIdDate(DateColis idDate) {
		IdDate = idDate;
	}
	public ModeEnvoi getIdModeEnvoi() {
		return IdModeEnvoi;
	}
	public void setIdModeEnvoi(ModeEnvoi idModeEnvoi) {
		IdModeEnvoi = idModeEnvoi;
	}
	public List getIdColis() {
		return IdColis;
	}
	public void setIdColis(List idColis) {
		IdColis = idColis;
	}
	public Ville getIdVilleDepart() {
		return IdVilleDepart;
	}
	public void setIdVilleDepart(Ville idVilleDepart) {
		IdVilleDepart = idVilleDepart;
	}
	public Ville getIdVilleArrivee() {
		return IdVilleArrivee;
	}
	public void setIdVilleArrivee(Ville idVilleArrivee) {
		IdVilleArrivee = idVilleArrivee;
	}
	public String getNombreKilosDispo() {
		return nombreKilosDispo;
	}
	public void setNombreKilosDispo(String nombreKilosDispo) {
		this.nombreKilosDispo = nombreKilosDispo;
	}
	public Double getPrixParKilo() {
		return prixParKilo;
	}
	public void setPrixParKilo(Double prixParKilo) {
		this.prixParKilo = prixParKilo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
