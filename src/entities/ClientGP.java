package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClientGP extends Client implements Serializable{
	
	@Id
	private int IdClientGP;

	public int getIdClientGP() {
		
		return IdClientGP;
	}

	public void setIdClientGP(int idClientGP) {
		IdClientGP = idClientGP;
	}
	
}
