package banque;

public class Date {


	private int jour;
	private int mois;
	private int an;
	
	public Date(int jour, int mois, int an) {
		this.jour = jour;
		this.mois = mois;
		this.an = an;
	}
	
	public int getJour() {
		return jour;
	}
	public int getMois() {
		return mois;
	}
	public int getAn() {
		return an;
	}
	@Override
	public String toString() {
		return "[" + jour + "/" + mois
				+ "/" + an + "]";
	}
	
	public boolean posterieurA(Date exp) {
		if ((exp.getAn()>getAn())||((exp.getMois()>=getMois())&&(exp.getAn()==getAn()))) {
			return true;
		}
		return false;
	}
	
}
