package surprise;

import java.util.ArrayList;

public class LifoBag implements IBag{
	
	private ArrayList <ISurprise> bagOfISurprises;
	static int counter ;
	
	public LifoBag() {
		this.bagOfISurprises = new ArrayList <ISurprise>();
	}
	
	public void put(ISurprise newSurprise) {
		bagOfISurprises.add(newSurprise);
		counter = bagOfISurprises.size();
	}
	
	
	public void put(IBag bagOfSurprises) {
		ArrayList <ISurprise> addingCollection = this.getBagOfISurprises();
		
		for (int i = 0; i < addingCollection.size(); ++i) {
			this.bagOfISurprises.add(addingCollection.get(i));
		}
		counter = bagOfISurprises.size();
	}

	public ISurprise takeOut() {
		--counter;
		if (counter == 0) {
			counter = bagOfISurprises.size();
		}
		return bagOfISurprises.remove(counter);
		
	}
	
	public  boolean isEmpty() {
		return bagOfISurprises.isEmpty();
	}
	
	public int size() {
		return bagOfISurprises.size();
	}
	
	public  ArrayList <ISurprise> getBagOfISurprises() {
		return bagOfISurprises;
	}
}
