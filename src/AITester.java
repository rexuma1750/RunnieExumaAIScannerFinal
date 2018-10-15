import java.util.Scanner;

public class AITester {
    public static void main(String[]args)
    {
        System.out.println("Pick a number between 1 and 100.");
        System.out.println("Indicate 'higher' or 'lower' to get closer to the correct guess.");
        Scanner input = new Scanner(System.in);
        String input = "";

        int min = 1;
        int max = 100;
        int numberOfGuesses = 1;
        int guessNumber = 24;

        while (!(input.equals("Correct! That is the right number.")))
        {
            System.out.println("Your guess is"+guessNumber+".");
            input = input.nextLine();
            if (input.equals("Guess higher."))
            {
                min = guessNumber;
                guessNumber = (max+min)/2;
                numberOfGuesses++;
            }
            else if (input.equals("Guess lower."))
            {
                max = guessNumber;
                guessNumber = (max+min)/2;
                numberOfGuesses++;
            }

        }
        System.out.println("I guessed correctly in"+numberOfGuesses+".");




    }
}
