package services;

import java.util.ArrayList;

import entities.Client;
import entities.Trajet;

public interface IClientService {
	
	public ArrayList<Client> getAllClient();
	public void deletedClient(int ClientID);
	public void addClient(Client client);
	public void updateClient(Client client);
}
