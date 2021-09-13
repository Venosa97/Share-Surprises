package surprise;

import java.util.Random;

public final class GatherSurprise {
	
	private GatherSurprise() {

	}
	
	//obtainting random object for random Suprises
	static Random randomNum = new Random();
	
	
	public ISurprise[] gather (int n) {
		ISurprise[] tolba = new ISurprise[n];
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
