package banque;

public class Banque {
	
	public int nbClient;
	public Client customer[]=new Client[100];
	
	public Banque() {
		super();
	}

	public int ajouterClient(String nom, Date naissance) {
		this.customer[nbClient]=new Client(nom, naissance);
		this.nbClient++;
		return nbClient;
	}
	
	public Client getClient(int numero) {
		return customer[numero-1];
	}
	
	public void afficherBilan() {
		for (int compteur=0;compteur<nbClient;compteur++) {
			customer[compteur].afficherSolde();
		}
	}
	
	public String genererAutorisation (Carte card, float montant) {
		if (card.date_valide()==true) {
			return "Ok";
		}
		return "C'est pas ok";
	}
	
}
