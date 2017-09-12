
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int i = 1;

        // program your solution here. Do not touch the above lines!
        while (true) {
            System.out.println("Guess the number:");
            int numberGuessed = Integer.parseInt(reader.nextLine());
            if (numberGuessed > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + i);
            }
            else if (numberGuessed < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + i);
            }
            else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
            i++;
        }
     }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
