/**
 * 
 */
package comptesbancaires.collection.dao;

import comptesbancaires.metiers.Client;

/**
 * @author IN-LL-046
 *
 */
public interface IClient {
	
	//Consulter les clients
	public Client consulterClient (double codeclient);
	
	//Ajouter un client
	public Client ajouterClient (Client c);
	
	//Consulter les clients dont le nom contient un mot clé

}
