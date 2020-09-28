import java.util.Scanner;

public class RandonNumberGuesser {

    /** Created by Michael Jarman */

    public static void main (String args[]) {
        // Declare and initialize variables along with calling RNG.rand() to get random number
        boolean cont = true;
        int guessNumber = 0;
        final int lowGuess = 0;
        int randomNumber = RNG.rand();
        final int highGuess = 100;
        RNG.scan = new Scanner(System.in);
        new RNG();

        // Print introduction
        System.out.println("Welcome to the Random Number Guessing Program!\nEnter your first guess");
        while (cont == true) {
            guessNumber = RNG.scan.nextInt();
            System.out.println("Number of guesses is " + RNG.getCount());
            if (RNG.inputValidation(guessNumber, lowGuess, highGuess) == true) {
                if (guessNumber == randomNumber) {
                    System.out.println("Congratulations, you guessed correctly");
                    System.out.println("Try again? (yes or no)");
                    RNG.scan.nextLine();
                    if (RNG.scan.nextLine().equalsIgnoreCase("yes")) {
                        RNG.resetCount();
                        randomNumber = RNG.rand();
                        new RNG();
                        System.out.println("Enter your first guess");
                    } else {
                        System.out.println("Thanks for playing...");
                        cont = false;
                    }
                } else {
                    if (guessNumber > randomNumber) {
                        System.out.println("Your guess is too high");
                        System.out.println("Enter your next guess");
                    } else if (guessNumber < randomNumber) {
                        System.out.println("Your guess is too low");
                        System.out.println("Enter your next guess");
                    }
                }
            } else {
                System.out.println("Enter your next guess");
            }
        }
        System.out.println("\n\nProgrammer: Michael Jarman");
    }

}
