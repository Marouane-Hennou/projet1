package banque;

public class Client {
	public String nom;
	public int nbcompte;
	public Date dob;
	public Compte comptes[]=new Compte[100];

	
	public Client(String nom, Date dob) {
		super();
		this.nom = nom;
		this.dob = new Date(dob.getJour(),dob.getMois(),dob.getAn());
	}

	public String getNom() {
		return nom;
	}
	
	public Date getDate() {
		return dob;
	}

	public Compte getCompte(int numero) {
		return comptes[numero-1];
	}
	
	public void afficherBilan() {
		for (int i=0;i<this.nbcompte;i++) {
			System.out.println("Le compte numéro "+(i+1)+" de " +getNom()+" à un solde de " + comptes[i].getSolde());
		}
	}
	
	float soldeTotal() {
		float total=0;
		for (int i=0;i<this.nbcompte;i++) {
			total=total+comptes[i].getSolde();
		}
		return total;
		
	}
	
	void afficherSolde() {
		System.out.println("Le solde total de " +getNom() +" né le "+getDate()+ " est de " + soldeTotal());
	}
	
	public int ajouterCompte () {
		this.comptes[this.nbcompte]=new Compte(0);
		this.nbcompte++;
		return nbcompte;	
	}
}
