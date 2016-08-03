package day3assignment;

public class BowlingNormal {

	public static void main(String[] args) {

		int numberOfPins = 10;
		int numberOfFrames = 10;
		int attemptsPerFrame = 2;
		

		for (int i = 1; i <= numberOfFrames; i++) {
			System.out.println("Frame " + i);
			
			for (int j = 1; j <= attemptsPerFrame; j++) {
				System.out.println("Roll " + j + " has scored:");	
			
				for (int k = 1; k <= 1; k++) {
					int aRoll = (int) ((Math.random() * numberOfPins) + 1);
					System.out.println(aRoll);
					
					
			}
			//black line between frames
			System.out.println();
		}
	}
}}
	// int firstRoll = (int) ((Math.random() * numberOfPins));