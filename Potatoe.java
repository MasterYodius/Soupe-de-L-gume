package soup2;

public class Potatoe extends Vegetable{
	//private double poids;
	private int nbgermes;
	private final static int CONSTANTE = 10;
	
	/** ------------CONSTRUCTEURS------------- */
	
	public Potatoe(double p, int g){
		super(p);
		this.setNbGermes(g);
	}
	
	public Potatoe(double p){
		super(p);
		this.nbgermes = (int)(p * CONSTANTE);
		
	}
	
	/** ------------ACCESSEURS------------- */
	/*
	public double getPoids(){
		return this.poids;
	}
	*/
	public int getNbGermes(){
		return this.nbgermes;
	}
	
	
	/** ------------MUTATEURS------------- */
	/*
	public void setPoids(double p){
		this.poids = p;
	}
	*/
	public void setNbGermes(int g){
		this.nbgermes = g;
	}

	/** ------------OPERATIONS------------- */
	
	/*public double getPeelingWeight(){
		double res = (this.getPoids() * 10)/100;
		res += (0.010) * this.getNbGermes();  // + 10 grammes par germme
		return res;
	}
	*/
	public double getPeelingWeight(){
		double res = this.getPoids() * super.getConstanteP();
		res += (0.010) * this.getNbGermes(); // + 10 grammes par germme
		return res;
	}

	
	/** ------------Méthode toString()------------- */

	public String toString() {
		String s = "oeil";
		if(this.getPoids()>0.2)
			s = "yeux";
		return "Patate: [" + this.getPoids() + "kg-" + this.getNbGermes() + s +"]";
	}


}
