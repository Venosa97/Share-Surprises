package surprise;

import java.util.Random;

public final class GatherSurprise {
	
	static ISurprise[] tolba;
	static boolean  singleton = false;
	
	private GatherSurprise(int n) {
		tolba  = new ISurprise[n];
	}
	
	//obtainting random object for random Suprises
	static Random randomNum = new Random();
	
	
	public ISurprise[] gather (int n) {
		
		if (singleton == true) {
			return tolba;
		}
		
		if (singleton == false) {
			new GatherSurprise(n);
		}
		
		if (singleton == false) {
			for (int i = 0; i < n; ++i) {
				int RanNum = randomNum.nextInt(3);
				if (RanNum == 0) {
					tolba[i] =  FortuneCookie.generateFortuneCookie();
				} else if (RanNum == 1) {
					tolba[i] = Candies.generateCandies();
				} else {
					tolba[i] = MinionToy.generateMinionToy();
				}
			}
		}
		singleton = true;
		return tolba;
	}
	
	public ISurprise gather (){
		int RanNum = randomNum.nextInt(3);
		if (RanNum == 0) {
			return FortuneCookie.generateFortuneCookie();
		} else if (RanNum == 1) {
			return Candies.generateCandies();
		} else {
			return MinionToy.generateMinionToy();
		}
	}
	
}
