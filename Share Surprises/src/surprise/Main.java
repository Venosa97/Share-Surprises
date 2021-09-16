package surprise;

public class Main {

	public static void main(String[] args) {
		System.out.println("\n\t ===== testGiveSurprisesAndApplauseFIFO ===== \t\n");
		testGiveSurprisesAndApplauseFIFO();
		
		System.out.println("\n\t ===== testGiveSurprisesAndApplauseLIFO ===== \t\n");
		testGiveSurprisesAndApplauseLIFO();
		
		System.out.println("\n\t ===== testGiveSurprisesAndApplauseRANDOM ===== \t\n");
		testGiveSurprisesAndApplauseRANDOM();

	}
	
	public static void testGiveSurprisesAndApplauseFIFO() {
		ISurprise s1 = GatherSurprise.gather();
		ISurprise s2 = GatherSurprise.gather();
		ISurprise s3 = GatherSurprise.gather();
		ISurprise s4 = GatherSurprise.gather();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		GiveSurpriseAndApplause g = new GiveSurpriseAndApplause("FIFO", 1);
		
		g.put(s1);
		g.put(s2);
		g.put(s3);
		g.put(s4);
		
		System.out.println("\n ==== Giving === \n");
		
		g.giveAll();
	}
	
	public static void testGiveSurprisesAndApplauseLIFO() {
		ISurprise s1 = GatherSurprise.gather();
		ISurprise s2 = GatherSurprise.gather();
		ISurprise s3 = GatherSurprise.gather();
		ISurprise s4 = GatherSurprise.gather();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		GiveSurpriseAndApplause g = new GiveSurpriseAndApplause("LIFO", 1);
		g.put(s1);
		g.put(s2);
		g.put(s3);
		g.put(s4);
		
		System.out.println("\n ==== Giving === \n");
		
		g.giveAll();
	}
	
	public static void testGiveSurprisesAndApplauseRANDOM() {
		ISurprise s1 = GatherSurprise.gather();
		ISurprise s2 = GatherSurprise.gather();
		ISurprise s3 = GatherSurprise.gather();
		ISurprise s4 = GatherSurprise.gather();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		GiveSurpriseAndApplause g = new GiveSurpriseAndApplause("RANDOM", 1);
		g.put(s1);
		g.put(s2);
		g.put(s3);
		g.put(s4);

		System.out.println("\n ==== Giving === \n");
		
		g.giveAll();
	}

}
