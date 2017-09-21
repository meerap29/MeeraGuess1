import java.util.Scanner;

public class Trial1 {

	public static void main(String[] args) {
		int guess;
		int actual;
		int bet;
		int total = 100;
		String mode;

		Scanner keyboard = new Scanner(System.in);
		keyboard.useDelimiter(System.getProperty("line.separator"));

		// to give instructions
		System.out.println("There is a new random number generated each time. ");
		System.out.println("There will be clues on what type of number the random number is.");
		System.out.println(" Your guess should be between 0 and 30.");
		System.out.println("0 here will count as an even number and prime number");
		System.out.println("and 1 will count as a prime number. 2 will count as a prime number and even number.");
		System.out.println("You have 100 dollars to bet, and you will bet after you see the clue about the number.");
		System.out.println(" Good luck!");

		do {
			//mode
			
			System.out.println("Easy or Hard?");
			mode = keyboard.next();
			
//random number
			actual = (int) (Math.random() * 30);
			System.out.println(" ");
			// for testing purposes
			// System.out.println("The number is " + actual);
		if (mode.equals("Easy"))	{
			// to give clues on number
						if (isPrime(actual)) {
							System.out.println("The secret number is a prime number.");
						}
						if (isEven(actual)) {
							System.out.println("The secret number is an even number.");
						}
						if (isOdd(actual)) {
							System.out.println("The secret number is an odd number.");
						}
						
						if (actual <= 10) {
							System.out.println("The number is less than or equal to 10");
						} else if (actual <=20) {
							System.out.println("The number is less than or equal to 20, but greater than 10.");
						} else {
							System.out.println("The number is greater than 20 and less than and equal to 30");
						}
						
						// to bet
						System.out.println(" ");
						System.out.println("Time to bet. You can bet a maximun of 100 (which means 100 dollars)"
								+ " and a minimum of 5 (which means 5 dollars)");
						System.out.println(" ");
						System.out.println("How much do you bet");
						bet = keyboard.nextInt();
						if (bet < 5) {
							System.out.println("Your bet is too small, so you are going to bet 10");
							bet = 10;
						} else if (bet > 100) {
							System.out.println("Your bet is too large, so you are going to bet " + total);
							bet = total;
						} else if (bet > total) {
							System.out.println("You do not have that much money, so you will be betting " + total);
							bet = total;
						} else {
							System.out.println("Your bet is " + bet);
						}
						// to guess
						System.out.println("Take a guess");
						guess = keyboard.nextInt();

						if (guess == actual) {
							System.out.println("You got it correct!");
							total = bet + total;
							System.out.println("You have " + total + " dollars left");

						} else if (guess != actual) {
							System.out.println("You got it wrong :(");
							total = total - bet;
							System.out.println("You have " + total + " dollars left");
						}
						// Displays actual number
						System.out.println("The random number was " + actual + " .");
		}
		
			if (mode.equals("Hard")) {
			// to give clues on number
			if (isPrime(actual)) {
				System.out.println("The secret number is a prime number.");
			}
			if (isEven(actual)) {
				System.out.println("The secret number is an even number.");
			}
			if (isOdd(actual)) {
				System.out.println("The secret number is an odd number.");
			}
			// to bet
			System.out.println(" ");
			System.out.println("Time to bet. You can bet a maximun of 100 (which means 100 dollars)"
					+ " and a minimum of 5 (which means 5 dollars)");
			System.out.println(" ");
			System.out.println("How much do you bet");
			bet = keyboard.nextInt();
			if (bet < 5) {
				System.out.println("Your bet is too small, so you are going to bet 10");
				bet = 10;
			} else if (bet > 100) {
				System.out.println("Your bet is too large, so you are going to bet " + total);
				bet = total;
			} else if (bet > total) {
				System.out.println("You do not have that much money, so you will be betting " + total);
				bet = total;
			} else {
				System.out.println("Your bet is " + bet);
			}
			// to guess
			System.out.println("Take a guess");
			guess = keyboard.nextInt();

			if (guess == actual) {
				System.out.println("You got it correct!");
				total = bet + total;
				System.out.println("You have " + total + " dollars left");

			} else if (guess != actual) {
				System.out.println("You got it wrong :(");
				total = total - bet;
				System.out.println("You have " + total + " dollars left");
			}
			// Displays actual number
			System.out.println("The random number was " + actual + " .");
			}
		} while (total > 0);
		System.out.println("You are now broke in this game. Sorry you can't play anymore.");
		System.out.println("You had a good run though!");
	}

	public static boolean isPrime(int n) {
		for (int divisor = 2; divisor * divisor <= n; divisor++) {
			if (n % divisor == 0) {
				return false; // for prime numbers
			}
		}

		return true;
	}

	public static boolean isEven(int n) {
		return (n % 2 == 0);
	}

	public static boolean isOdd(int n) {
		return (n % 2 == 1);
	}

}