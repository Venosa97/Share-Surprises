package surprise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Candies implements ISurprise {
	
	
	static ArrayList <String> CandiesType = new ArrayList<String>(Arrays.asList("ciocolata", "jeleu", "vanilie", "fructe"));
	int numberOfCandies;
	String CandieTypeForObject;
	static Random randomNum = new Random();
	
	//constructor
	private Candies(int number, String CandieTypeForObject) {
		this.numberOfCandies = number;
		this.CandieTypeForObject = CandieTypeForObject;
	}
	
	
	//generating Surprise
	public static Candies generateCandies() {
		int numOfCandies = randomNum.nextInt(21);
		int typeCandy = randomNum.nextInt(CandiesType.size());
		String CandieTypeForObject = CandiesType.get(typeCandy);
		Candies surpriseCandies = new Candies (numOfCandies, CandieTypeForObject);
		return surpriseCandies;
	}
	
	@Override
	public void enjoy() {
		System.out.println("Surpriza! Ai primit " + this.numberOfCandies + " bomboane de " + this.CandieTypeForObject + ".");
	}
}
