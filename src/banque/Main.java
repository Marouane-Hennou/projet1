package banque;

public class Main {
	
	public static void main(String[] args) {
		System.out.println(new Date(14,02,2007));
		Compte postale = new Compte(5);
		postale.afficherSolde();
		postale.depot(10);
		postale.afficherSolde();
		postale.retrait(6);
		postale.afficherSolde();
		Banque LCL = new Banque();
		LCL.ajouterClient("Marouane", new Date (02,02,1997));
		LCL.ajouterClient("Pierre", new Date (19,11,1988));
		LCL.customer[0].ajouterCompte();
		LCL.customer[0].ajouterCompte();
		LCL.customer[1].ajouterCompte();
		LCL.customer[1].comptes[0].depot(250);
		LCL.customer[0].comptes[0].depot(50);
		LCL.customer[0].comptes[1].depot(120);
		int[] pass = {1,2,3,4};
		int[] passwrong= {1,4,2,4};
		Carte Gold = new Carte(pass, 0, 1, new Date(31,03,2022), LCL);
		Terminal Mcdo = new Terminal (0,1, LCL);
		LCL.afficherBilan();
		Mcdo.payer(100.2f, Gold, passwrong);
		LCL.afficherBilan();
		//LCL.customer[0].comptes[0].virer(40.0f, LCL.customer[1].comptes[0]);
		//LCL.afficherBilan();
		//System.out.println(Gold.getDateValid());
	}

}
