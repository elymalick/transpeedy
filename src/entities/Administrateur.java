package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Administrateur extends Client implements Serializable{
	
	@Id
	private int Idadministrateur;

	public int getIdadministrateur() {
		return Idadministrateur;
	}

	public void setIdadministrateur(int idadministrateur) {
		Idadministrateur = idadministrateur;
	}
	

}
