import java.util.Scanner;

public class NewProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		keyboard.useDelimiter(System.getProperty("line.separator"));

		String response1, response2, response3, response4, response5, response6, response7, response8, response9,
				response10;

		System.out.println("Here are some jokes/riddles to solve. ");
		System.out.println(
				"You may get it right, but it may mark you wrong because that way of saying it hasn't been coded ");
		System.out.println("Keep answers as short as possible!");
		System.out.println(" ");

		System.out.println("What goes up and never comes down?");
		response1 = keyboard.next();
		// 1st one
		response1 = response1.toUpperCase();
		// System.out.println(response1 + " is your response");

		if (response1.equals("AGE")) {
			System.out.println("Correct");
		} else {
			System.out.println("Wrong");
		}
		// 2nd one
		System.out.println("Next One!");
		System.out.println("What goes up, makes a *ding* and comes back down?");
		response2 = keyboard.next();

		response2 = response2.toUpperCase();
		// System.out.println(response2 + " is your response");

		if (response2.equals("AN ELEVATOR")) {
			System.out.println("Correct");
		} else if (response2.equals("ELEVATOR")) {
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong");
		}
		// 3rd one
		System.out.println("Here's another one");
		System.out.println("What can you catch but not throw?");
		response3 = keyboard.next();

		response3 = response3.toUpperCase();

		if (response3.equals("A COLD")) {
			System.out.println("Correct");
		} else if (response3.equals("COLD")) {
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong");
		}
		// 4th one
		System.out.println("Guess you can try another one.");
		System.out.println("Mary's mom has 4 children--April, May, June, so who is the last one?");
		response4 = keyboard.next();

		response4 = response4.toUpperCase();

		if (response4.equals("MARY")) {
			System.out.println("Correct");
		} else if (response4.equals("MARY IS THE FOURTH DAUGHTER")) {
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong");
		}
		// 5th one
		int ans5;
		System.out.println("Well... here's another one");
		System.out.println("How many months have 28 days in it? (Type out the number of months)");
		response5 = keyboard.next();

		response5 = response5.toUpperCase();

		if (response5.equals("ALL")) {
			System.out.println("Correct");
		} else if (response5.equals("ALL OF THEM DO")) {
			System.out.println("Correct!");
		} else if (response5.equals("TWELVE")) {
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong");
		}
		// 6th one
		System.out.println("Here's a hard one");
		System.out.println("Where do Zombies go for Vacation?");
		response6 = keyboard.next();

		response6 = response6.toUpperCase();

		if (response6.equals("THE DEAD SEA")) {
			System.out.println("Correct");
		} else if (response6.equals("DEAD SEA")) {
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong");
		}
		// 7th one
		System.out.println("Here's another one");
		System.out.println("What goes down, but never goes up?");
		response7 = keyboard.next();

		response7 = response7.toUpperCase();

		if (response7.equals("RAIN")) {
			System.out.println("Correct");
		} else {
			System.out.println("Wrong");
		}
		// 8th one
		int numresponse;
		System.out.println("This is the 8th one");
		System.out.println("I am an odd number. Take away a letter, and I become even. What number am I?");
		response8 = keyboard.next();
		numresponse = keyboard.nextInt();

		response8 = response8.toUpperCase();

		if (response8.equals("SEVEN")) {
			System.out.println("Correct");
		} else if (numresponse == 7) {
			System.out.println("Correct");
		} else {
			System.out.println("Wrong");
		}
		// 9th one
		System.out.println("Still going");
		System.out.println(
				"It took 5 days for a group of men to dig a hole. How long will it take the same men to dig half of a hole?");
		System.out.println("Type out the number!");
		response9 = keyboard.next();

		if (response9.equals("ZERO")) {
			System.out.println("Correct");
		} else if (response9.equals("ZERO DAYS")) {
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong");
		}

		// 10th one
		System.out.println("Think hard for this one");
		System.out.println("What is easy to get into, but hard to get out of?");
		response10 = keyboard.next();

		if (response10.equals("QUICKSAND")) {
			System.out.println("Correct");
		} else if (response10.equals("JAIL")) {
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong");
		}
		// 11th one
		String response11, response12, response13;
		System.out.println("New One!");
		System.out.println("What appears once in a month, twice in a moment, and never in a thousand years?");
		response11 = keyboard.next();

		if (response11.equals("THE LETTER M")) {
			System.out.println("Correct");
		} else if (response11.equals("M")) {
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong");
		}

		// 12th one
		System.out.println("{Insert transition here}");
		System.out.println("What appears at the end of a rainbow?");
		response12 = keyboard.next();

		if (response12.equals("THE LETTER W")) {
			System.out.println("Correct");
		} else if (response12.equals("W")) {
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong");
		}
		// 13th one
		System.out.println("...");
		System.out.println("What has 4 eyes but cannot see?");
		response13 = keyboard.next();

		if (response13.equals("MISSISSIPPI")) {
			System.out.println("Correct");
			// } else if (response13.equals("W")) {
			// System.out.println("Correct!");
		} else {
			System.out.println("Wrong");
		}
		// 14th one
		String response14, response15, response16, response17;
		System.out.println("{Insert transition here}");
		System.out.println("What appears at the end of a rainbow?");
		response14 = keyboard.next();

		if (response14.equals("THE LETTER W")) {
			System.out.println("Correct");
		} else if (response14.equals("W")) {
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong");
		}
		// 15TH ONE
		System.out.println("Here's another one");
		System.out.println("What begins with 't,' and is filled with 't,' and ends with 't'? ");
		response15 = keyboard.next();

		if (response15.equals("A TEAPOT")) {
			System.out.println("Correct");
		} else if (response15.equals("TEAPOT")) {
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong");
		}
		// 16th one
		System.out.println(":)");
		System.out.println("What has an eye but cannot see?");
		response16 = keyboard.next();

		if (response16.equals("A HURRICANE")) {
			System.out.println("Correct");
		} else if (response16.equals("HURRICANE")) {
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong");
		}
		// 17th one
		System.out.println("I'm running out of ideas here");
		System.out.println("What travels around the world but stays in one corner?");
		response17 = keyboard.next();

		if (response17.equals("A STAMP")) {
			System.out.println("Correct");
		} else if (response17.equals("STAMP")) {
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong");
		}

	}

}
