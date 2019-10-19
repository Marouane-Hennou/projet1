package banque;

public class Terminal {

	private int numClient, numCompte;
	private Banque bank;
	
	public Terminal(int numClient, int numCompte, Banque bank) {
		super();
		this.numClient = numClient;
		this.numCompte = numCompte;
		this.bank = bank;
	}
	
	public int payer(float montant, Carte card, int[] code ) 
	{
		if(card.codeValide(code)==false) {
			System.out.println("Erreur, code non valide");
			return 1;
		}
		else {
			if (card.getBanque().genererAutorisation(card, montant)=="Ok") {
				card.payer(this.bank, this.numClient, this.numCompte, montant);
			}
			else {
				System.out.println("Erreur, paiement refusé");
				return 2;
				}
			}
		return 0;
	}


}