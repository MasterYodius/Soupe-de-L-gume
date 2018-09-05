package soup2;

public class Carrot extends Vegetable{
	//private double poids;
	private int longueur;
	
/** ------------CONSTRUCTEUR------------- */
	public Carrot(double p, int l){
		super(p);
		this.setLongueur(l);
		}

/** ------------ACCESSEURS------------- */
/*
	public double getPoids() {
		return this.poids;
	}
*/
	public int getLongueur() {
		return longueur;
	}
/** ------------MUTATEURS------------- */

/*	public void setPoids(double poids) {
		this.poids = poids;
	}
*/
	
	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}
	
/** ------------OPERATIONS------------- */
	/*public double getPeelingWeight(){
		double res = (this.getPoids() * 10)/100;
		return res;
	}
	*/
	
	public double getPeelingWeight(){
		double res = (this.getPoids() * super.getConstanteP());
		return res;
	}

	
/** ------------Méthode toString()------------- */
	public String toString(){
		return "Carotte [" + this.getPoids() +"kg-"+this.getLongueur()+"cm" +"]";
	}

}
