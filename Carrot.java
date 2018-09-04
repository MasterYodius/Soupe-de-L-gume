package soup1;

public class Carrot {
	private double poids;
	private int longueur;
	
/** ------------CONSTRUCTEUR------------- */
	public Carrot(double p, int l){
		this.setPoids(p);;
		this.setLongueur(l);
		}

/** ------------ACCESSEURS------------- */

	public double getPoids() {
		return this.poids;
	}
	
	public int getLongueur() {
		return longueur;
	}
/** ------------MUTATEURS------------- */

	public void setPoids(double poids) {
		this.poids = poids;
	}

	
	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}
	
/** ------------Méthode toString()------------- */
	public String toString(){
		return "Carotte [" + this.getPoids() +"kg-"+this.getLongueur()+"cm" +"]";
	}

}
