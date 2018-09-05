package soup2;

public abstract class Vegetable {
	
	private double poids;
	private static double ConstantePeelingWeight = 0.1;
	
/** ------------CONSTRUCTEURS------------- */
	public Vegetable(double p){
		this.setPoids(p);
	}
	
/** ------------ACCESSEURS------------- */
	
	public double getPoids(){
		return this.poids;
	}
	
/** ------------MUTATEURS------------- */
	
	public void setPoids(double p){
		this.poids = p;
	}
	
	public double getConstanteP(){
		return Vegetable.ConstantePeelingWeight;
	}
	
	public static void setPeelingWeight(double a){
		Vegetable.ConstantePeelingWeight = a;
	}
	
	public abstract double getPeelingWeight();
		
	
	

/** ------------toString------------- */
	
	public abstract String toString();

}
