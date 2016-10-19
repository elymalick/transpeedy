package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ModeEnvoi implements Serializable{
	@Id
	private int dModeEnvoi;
	private String TypeColis;
	private CategorieModeEnvoi IdCategorieModeEnvoi;
	public int getdModeEnvoi() {
		return dModeEnvoi;
	}
	public void setdModeEnvoi(int dModeEnvoi) {
		this.dModeEnvoi = dModeEnvoi;
	}
	public String getTypeColis() {
		return TypeColis;
	}
	public void setTypeColis(String typeColis) {
		TypeColis = typeColis;
	}
	public CategorieModeEnvoi getIdCategorieModeEnvoi() {
		return IdCategorieModeEnvoi;
	}
	public void setIdCategorieModeEnvoi(CategorieModeEnvoi idCategorieModeEnvoi) {
		IdCategorieModeEnvoi = idCategorieModeEnvoi;
	}
	
}
