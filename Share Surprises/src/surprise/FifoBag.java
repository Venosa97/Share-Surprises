package surprise;

import java.util.ArrayList;


public class FifoBag implements IBag {
	
	private ArrayList <ISurprise> bagOfISurprises;
	static int counter = -1;
	
	public FifoBag() {
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
		++counter;
		if (counter >= this.bagOfISurprises.size()) {
			counter = -1;
		}
		return this.bagOfISurprises.remove(counter);
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
