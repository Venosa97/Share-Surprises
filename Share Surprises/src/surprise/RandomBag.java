package surprise;

import java.util.ArrayList;
import java.util.Random;

public class RandomBag implements IBag {
	
	private ArrayList <ISurprise> bagOfISurprises;
	
	
	//creating new object Random
	static Random randomObj = new Random();
	
	public RandomBag() {
		this.bagOfISurprises = new ArrayList <ISurprise>();
	}
	
	public void put(ISurprise newSurprise) {
		bagOfISurprises.add(newSurprise);
	}
	
	
	public void put(IBag bagOfSurprises) {
		ArrayList <ISurprise> addingCollection = this.getBagOfISurprises();
		
		for (int i = 0; i < addingCollection.size(); ++i) {
			this.bagOfISurprises.add(addingCollection.get(i));
		}
	}

	public ISurprise takeOut() {
		int randomNum = randomObj.nextInt(getBagOfISurprises().size());
		return this.bagOfISurprises.get(randomNum);
	}
	
	public  boolean isEmpty() {
		return bagOfISurprises.isEmpty();
	}
	
	public int size() {
		return bagOfISurprises.size();
	}
	
	public ArrayList <ISurprise> getBagOfISurprises() {
		return bagOfISurprises;
	}
}
