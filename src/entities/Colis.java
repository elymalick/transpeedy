package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Colis implements Serializable{
	
	@Id
	private int IdColis;
	private TypeColis IdTypeColis;
	private String nom;
	
	public int getIdColis() {
		return IdColis;
	}
	public void setIdColis(int idColis) {
		IdColis = idColis;
	}
	public TypeColis getIdTypeColis() {
		return IdTypeColis;
	}
	public void setIdTypeColis(TypeColis idTypeColis) {
		IdTypeColis = idTypeColis;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}


}
