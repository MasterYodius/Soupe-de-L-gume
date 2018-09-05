package soup2;

import java.util.ArrayList;

public class Soup {
	
	private ArrayList<Vegetable> ingredients;
	
	/** ------------CONSTRUCTEURS------------- */
	
	public Soup(){
		this.ingredients = new ArrayList<Vegetable>();
	}
	
	/** ------------ACCESSEURS------------- */
	
	public Vegetable getVegetable(int i){
		return this.ingredients.get(i);
	}
	
	/** ------------OPERATIONS------------- */
	
	public void add(Vegetable v){
		this.ingredients.add(v);
	}
	
	
	
	public double getPeelingWeight(){
		double res = 0;
		for(Vegetable v : this.ingredients){
			res += v.getPeelingWeight();
		}
		return res;
	}

	
	/** ------------toString------------- */
	
	public String toString(){
		String s = " Soupe " + "\n" + "------ \n";
		for(Vegetable i:this.ingredients){
			s = s + i.toString() +"\n";
		}
		return s;
	}
}
