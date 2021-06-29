import java.util.*;

public class GuessingGame {

    public static void main(String[] args) {
        String playAgain = "";
        Scanner scan = new Scanner(System.in);
        int repeat = 1;

        do {
            if (repeat != 3) {
                System.out.println(repeat);
                inputGuess();
                System.out.println("Would you like to play again? Enter Y to play or any other key to quit: ");
                playAgain = scan.nextLine();
            }
            repeat++;
        } while (playAgain.toLowerCase().equals("y") && repeat < 4);
        System.out.println("Thanks for playing!");
    }

    public static void inputGuess() {

        Random num = new Random();
        int answer = num.nextInt(10) + 1;
        Scanner input = new Scanner(System.in);
        int guess;

        System.out.println("Enter a number between 1 and 10 as your first guess: ");
        guess = input.nextInt();

        do {
            if (guess < 1 || guess > 10) {
                System.out.println("That is not a valid entry. Please try again: ");
                guess = input.nextInt();
            } else if (guess > answer) {
                System.out.println("Too high, Try Again: ");
                guess = input.nextInt();
            } else if (guess < answer) {
                System.out.println("Too low, Try Again: ");
                guess = input.nextInt();
            }
            input.nextLine();

        } while (guess != answer);

        System.out.println("Congratulations, You guessed the number!");
    }
}
