package surprise;

import java.util.ArrayList;
import java.util.Random;

public class FortuneCookie implements ISurprise {
	
	
	ArrayList <String> messages;
	String message;
	static Random random = new Random();
	
	private FortuneCookie(int index) {
		
		messages = new ArrayList<String>();
		
		//giving quotes to fortuneCookie
				messages.add("Wheresoever you go, go with all your heart. - Confucious");
				messages.add("The more you give away, the more happy you become.\r\n"
						+ "Why fit in when you were born to stand out? - Dr.Suess");
				messages.add("Fall seven times, stand up eight. - Japanese Proverb");
				messages.add("Do what you can, with what you have, where you are. - Theodore Roosevelt");
				messages.add("Yesterday is history. Tomorrow is a mystery. Today is a gift. That’s why we call it ‘The Present.’ - Eleanor Roosevelt");
				messages.add("You always pass failure on the way to success. - Mickey Rooney");
				messages.add("Row, row, row your boat. Gently down the stream. Merrily, merrily, merrily, merrily, life is but a dream. - Alice Munro ");
				messages.add("Make each day your masterpiece. - John Wooden");
				messages.add("No one is perfect – that’s why pencils have erasers. - Wolfgang Riebe");
				messages.add("Only surround yourself with people who will lift you higher. - Oprah Winfrey ");
				messages.add("Have a heart that never hardens, and a temper that never tires, and a touch that never hurts. - Charles Dickens ");
				messages.add("We grow great by dreams. - Woodrow Wilson ");
				messages.add("Always be a first-rate version of yourself,\r\n"
						+ "instead of a second-rate version of somebody else. - Judy Garland");
				messages.add("Go confidently in the direction of your dreams. Live the life you have imagined. - Henry David Thoreau");
				messages.add("Life itself is the most wonderful fairy tale. - Hans Christen Andersen");
				messages.add("Choose a job you love, and you will never have to work a day in your life. - Confucious");
				messages.add("Be kind whenever possible. It is always possible. - Dalai Lama");
				messages.add("It’s not what happens to you\r\n"
						+ "but how you react to it that matters. - Epictetus");
				messages.add("The only man who never makes a mistake is the man who never does anything - Theodore Roosevelt");
				messages.add("The secret of getting ahead is getting started. - Mark Twain");
				this.message = messages.get(index);
	}
	
	public static FortuneCookie generateFortuneCookie() {
		int index = random.nextInt(20);
		FortuneCookie cookie = new FortuneCookie(index);
		return cookie;
	}
	
	public String getMessage() {
		return this.message;
	}
	public void enjoy() {
		System.out.println("Surpriza! Ai primit un Fortune Cookie! Citatul zilei este: " +  getMessage());
	}
}	

