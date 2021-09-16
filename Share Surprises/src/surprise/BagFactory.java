package surprise;

public class BagFactory implements IBagFactory{
	

	static IBag lastTypeOfBag;
	private IBag typeOfBag;
	private static BagFactory originalBag;
	
	private BagFactory() {
		
	}
	
	public IBag makeBag (String name) {
		String nameCaseInsensitive = name.toLowerCase();
		
		if (lastTypeOfBag != null) {
			return lastTypeOfBag;
		}
		
		switch (nameCaseInsensitive) {
			case "random":
				typeOfBag = new RandomBag();
				return lastTypeOfBag = new RandomBag();
			case "fifo":
				typeOfBag = new FifoBag();
				return lastTypeOfBag = new FifoBag();
			case "lifo":
				typeOfBag = new LifoBag();
				return lastTypeOfBag =  new LifoBag();
			}
		
		return null;
	}
	
	public static BagFactory getInstance() {
		if (lastTypeOfBag == null) {
			originalBag = new BagFactory();
		}
		return originalBag;
	}
	
	public IBag getTypeOfBag() {
		return typeOfBag;
	}

}
