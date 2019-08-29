package studio1;

import support.cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String name1 = ap.nextString("What's your name, my green companion?");
		String name2 = ap.nextString("And you, strange man?");
		String name3 = ap.nextString("And what do they call you?");
		String name4 = ap.nextString("Comment t'appelle tu?");
		System.out.println ("What's poppin', " + name1 + ", " + name2 + ", " + name3 + ", and " + name4 + "! " +
				"PREPARE FOR YOUR GRAND ADVENTURE!");
		//
		// Say hello to the names in s0 through s3.
		//

	}
}
