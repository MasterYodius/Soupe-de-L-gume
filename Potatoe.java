package soup1;

public class Potatoe {
	private double poids;
	private int nbgermes;
	
	/** ------------CONSTRUCTEUR------------- */
	
	public Potatoe(double p, int g){
		this.setPoids(p);
		this.setNbGermes(g);
	}
	
	/** ------------ACCESSEURS------------- */
	
	public double getPoids(){
		return this.poids;
	}
	
	public int getNbGermes(){
		return this.nbgermes;
	}
	
	/** ------------MUTATEURS------------- */
	
	public void setPoids(double p){
		this.poids = p;
	}
	
	public void setNbGermes(int g){
		this.nbgermes = g;
	}

	
	
	/** ------------Méthode toString()------------- */

	public String toString() {
		return "Patate: [" + this.getPoids() + "kg-" + this.getNbGermes() + " yeux]";
	}


}
