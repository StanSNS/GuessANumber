package GuessANumber;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        int computerNumber = random.nextInt(100);

        System.out.print("Guess a number (1-100): ");
        int numberInput = Integer.parseInt(scan.next());

        while (true) {
            if (numberInput > computerNumber) {
                System.out.println("Too High");
                System.out.print("Guess a number (1-100): ");
                numberInput = Integer.parseInt(scan.next());
            } else if (numberInput < computerNumber) {
                System.out.println("Too Low");
                System.out.print("Guess a number (1-100): ");
                numberInput = Integer.parseInt(scan.next());
            } else {
                System.out.println("You guessed it!!!!!!!!!!!!!!!!!!!!!");
                break;
            }
        }


    }
}
