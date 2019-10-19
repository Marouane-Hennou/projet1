package tests;

import banque.*;

public class Main {
	
	public static void main(String[] args) {
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
		Carte Gold = new Carte(new int[]{4247}, 0, 1, new Date(31,03,2022), LCL);
		Terminal Mcdo = new Terminal (0,1, LCL);
		LCL.afficherBilan();
		Mcdo.payer(5.2f, Gold, new int[] {7217});
		LCL.afficherBilan();
		LCL.customer[0].comptes[0].virer(40.0f, LCL.customer[1].comptes[0]);
		LCL.afficherBilan();
	}

}
