package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ville implements Serializable{

	@Id
	private int Idville	;
	 private String ville;
	public int getIdville() {
		return Idville;
	}
	public void setIdville(int idville) {
		Idville = idville;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	 

}
