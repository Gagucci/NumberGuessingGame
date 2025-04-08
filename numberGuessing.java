import java.util.Scanner;
import java.util.Random;

public class numberGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number;
        int randomNumber = random.nextInt(100) + 1;
        int guessCount = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        System.out.print("📝 What's your name? ");
        String playerName = scanner.nextLine();
        System.out.println("Nice to meet you, " + playerName + "! Let's play!");

        System.out.println("""
    ========================================
            NUMBER GUESSING GAME
    Try your luck and test your intuition!
    ========================================
""");



        do {
            System.out.print("Enter your number(1-100): ");
            number = scanner.nextInt();
            guessCount++;

            int difference = Math.abs(number - randomNumber);

            if (difference > 30) {
                System.out.println(" Ice cold!");
            } else if (difference > 15) {
                System.out.println(" A bit chilly...");
            } else if (difference > 5) {
                System.out.println(" Getting warm!");
            } else {
                System.out.println( "You're hot!");
            }

            if (number < 0 || number > 100) {
                System.out.println("Invalid Number! Please choose from 1-100.");
            }else if (number == randomNumber) {
                System.out.println("Congratulations! You guessed the number " + playerName + randomNumber + "🎉");
                System.out.println("It took you " + guessCount + " guesses!");
            }else if (number > randomNumber) {
                System.out.println("Lower! You have " + (5 - guessCount) + " guesses left.");
            }else if (number < randomNumber) {
                System.out.println("Higher! You have " + (5 - guessCount) + " guesses left.");
            }

            if (guessCount >= 3 && number != randomNumber) {
                System.out.println("You are taking along time!!! Cmon dummy!");
            }
            if (guessCount == 5 && number != randomNumber) {
                System.out.println("Ran out of guesses! Try again! The number was " + randomNumber);
                break;

            }

        }while (number != randomNumber);
    }
}

