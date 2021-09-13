package surprise;

import java.util.ArrayList;
import java.util.Arrays;

public class MinionToy implements ISurprise{
	
	String nameOfMinion;
	static ArrayList<String> minions =  new ArrayList<String>(Arrays.asList("Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"));
	static int contor = 0;

	
	private MinionToy (String nameOfMinion) {
		this.nameOfMinion = nameOfMinion;
	}
	
	public static MinionToy generateMinionToy() {
		if (contor >= minions.size()) {
			contor = 0;
		}
		String nameOfMinion = minions.get(contor);
		++contor;
		return new MinionToy(nameOfMinion);
	}
	
	@Override
	public void enjoy() {
		System.out.println("Surpriza! L-ai primit pe " + this.nameOfMinion + ", minion Toy-ul!");
	}

}
