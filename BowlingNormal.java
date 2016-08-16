package day3assignment;

public class BowlingNormal {

	public static void main(String[] args) {

		int numberOfPins = 10;
		int numberOfFrames = 9;

		for (int i = 1; i <= numberOfFrames; i++) {

			System.out.println("Frame " + i + ":");
			int roll1 = (int) (Math.random() * numberOfPins + 1);
			System.out.println("Roll 1 is: " + roll1);

			if (roll1 < 10) {
				int roll2 = (int) (Math.random() * ((numberOfPins + 1) - roll1));
				System.out.println("Roll 2 is: " + roll2);
				System.out.println();

				if ((roll1 + roll2) == 10) {
					System.out.println("You rolled a spare!");
					System.out.println();
				}
			} else {
				System.out.println(" ");
				System.out.println("Your first roll was a STRIKE!! \n");
			} // close the else for strike
		} // first for loop
		int frame10roll2 = 0;
		int frame10roll1 = 0;
		int frame10roll3 = 0;

		frame10roll1 = (int) (Math.random() * numberOfPins + 1);
		System.out.println("Frame 10:");
		System.out.println("Roll 1 is a : " + frame10roll1);

		if (frame10roll1 < 10) {
			frame10roll2 = (int) (Math.random() * ((numberOfPins + 1) - frame10roll1));
			System.out.println("Roll 2 is a:" + frame10roll2);

			if ((frame10roll1 + frame10roll2) == 10) {
				System.out.println(" ");
				System.out.println("You rolled a spare!");
				System.out.println();
			}
		} else {
			System.out.println("You rolled a STRIKE!! \n");
			frame10roll2 = (int) (Math.random() * numberOfPins + 1);

			System.out.println("Roll 2 is a:" + frame10roll2);
		}
		if (Math.addExact(frame10roll1, frame10roll2) == 20) {
			System.out.println("Another strike! You get a third roll!");
			frame10roll3 = (int) (Math.random() * numberOfPins + 1);
			System.out.println("Roll 3 is a: " + frame10roll3);
		}
	} // main
} // class
