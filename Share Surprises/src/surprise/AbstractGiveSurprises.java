package surprise;

import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {
	
	private IBag bag;
	private int waitTime;

	public AbstractGiveSurprises(String type, int waitTime) {
		this.bag = BagFactory.getInstance().makeBag(type);
		this.waitTime = waitTime;
	}

	public void put(ISurprise newSurprise) {
		this.bag.put(newSurprise);
	}
	
	public void put(IBag surprises) {
		this.bag.put(surprises);
	}
	
	public void give() {
		if (this.bag.isEmpty()) {
			System.out.println("The bag is empty!");
		}
		this.bag.takeOut().enjoy();
	}
	
	public void giveAll() {
		if (bag.isEmpty()) {
			System.out.println("The bag is empty");
			return;
		}
		int limit = this.bag.size();
		while (limit > 0) {
			try {
				this.give();
				TimeUnit.SECONDS.sleep(waitTime); // number of seconds to sleep
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			limit--;
		}
	}
	
	public boolean isEmpty() {
		return this.bag.isEmpty();
	}
	
	abstract void giveWithPassion();
}
	

