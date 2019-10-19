package banque;

public class Carte {
	private int code[]=new int[4];
	private int nbTentatives=0, numClient, numCompte;
	private Date expiration=new Date(16,04,2022);
	private Banque bank;
	
	public Carte(int[] code, int numClient, int numCompte, Date expiration, Banque bank) {
		super();
		this.code = code;
		this.numClient = numClient;
		this.numCompte = numCompte;
		this.expiration = new Date(expiration.getJour(),expiration.getMois(),expiration.getAn());
		this.bank = bank;
	}

	public Date getDateValid() {
		return expiration;
	}
	
	public Banque getBanque() {
		return bank;
	}
	
	public int getNbTentatives() {
		return nbTentatives;
	}
	
	public boolean codeValide(int[] codeTape) {
		for (int i=0;i<4;i++) {
			if (codeTape[i]!=code[i]) {
				return false;
			}
		}
		return true;
	}
	
	public boolean date_valide() {
		return expiration.posterieurA(expiration);
		
	}
	
	public void payer(Banque bank, int client, int compte, float montant) {
		bank.customer[client].comptes[compte].retrait(montant);
	}
	
}
