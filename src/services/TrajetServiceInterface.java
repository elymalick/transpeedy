package services;

import java.util.ArrayList;

import entities.Trajet;

public interface TrajetServiceInterface {
	public ArrayList<Trajet> getAllTraget();
	public void deletedTraget(int trajetID);
	public void addTrajet(Trajet trajet);
	public void updateTrajet(Trajet trajet);
}
