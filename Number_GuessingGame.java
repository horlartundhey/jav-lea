import java.util.Scanner;
import java.util.Random;

public class Number_GuessingGame{
    public static int  generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1; // Generates a random number between 1 and 100
    }

    public static String checkGuess(int guess, int target) {
        if(guess > target) {
            return "Too high!";
        }else if(guess < target) {
            return "Too low";
        }else{
            return "Correct! You've guessed the number!";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = generateRandomNumber();
        int attempts = 0; 
        boolean isCorrect = false;

        System.out.println("Welcome to the Number Guessing game");
        System.out.println("Guess a number between 1 and 100: ");

        while(!isCorrect) {
            System.out.println("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            String result = checkGuess(guess, target);
            System.out.println(result);

            if(result.equals("Correct! You've guessed the number!")){
                isCorrect = true;
            }
        }
        System.out.println("You got it in " + attempts + " attempts!");
        scanner.close();
    }

}