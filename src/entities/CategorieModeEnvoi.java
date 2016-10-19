package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CategorieModeEnvoi implements Serializable{
	
	@Id
	private int IdCategorieModeEnvoi;
	private ModeEnvoi modeEnvoi;
	public int getIdCategorieModeEnvoi() {
		return IdCategorieModeEnvoi;
	}
	public void setIdCategorieModeEnvoi(int idCategorieModeEnvoi) {
		
		IdCategorieModeEnvoi = idCategorieModeEnvoi;
	}
	public ModeEnvoi getModeEnvoi() {
		return modeEnvoi;
	}
	public void setModeEnvoi(ModeEnvoi modeEnvoi) {
		this.modeEnvoi = modeEnvoi;
	}
	

}
