package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TypeColis implements Serializable{

	@Id
	private int IdTypeColis	;
	private String TypeColis;
	public int getIdTypeColis() {
		return IdTypeColis;
	}
	public void setIdTypeColis(int idTypeColis) {
		IdTypeColis = idTypeColis;
	}
	public String getTypeColis() {
		return TypeColis;
	}
	public void setTypeColis(String typeColis) {
		TypeColis = typeColis;
	}
	

}
