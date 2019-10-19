package banque;

public class Compte {
	
	private float solde = 0;
	
	public Compte(float solde) {
		super();
		this.solde = solde;
	}


	public float getSolde() {
		return this.solde;
	}
	
	public void afficherSolde () {
		System.out.println(solde);
	}
	
	public void depot(float valeur) {
		this.solde=this.solde+valeur;
	}
	
	public void retrait(float valeur){
		this.solde=this.solde-valeur;
	}
	
	public void virer(float valeur, Compte destinataire) {
		destinataire.depot(valeur);
		retrait(valeur);
	}

}
