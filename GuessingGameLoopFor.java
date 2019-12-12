import java.util.Random;
import java.util.Scanner;

public class GuessingGameLoopFor {

    public static void main(String[] args){

        Random rand = new Random(); //begin the random number generation
        final int MAX = 10;     // constant to define the MAX random number value
        final int MIN = 1;      // constant to define the MIN random number value
        int randomNumber = rand.nextInt(MAX) + MIN;     //variable to store the random number

        int userGuess = 0;      //variable for user guess
        Scanner in = new Scanner(System.in);       //prepare for user input

        for(int i = 1; i <= 10 ; i++){
            //get guess from user
            System.out.println("Please guess a random number between " + MIN + " AND " + MAX);
            userGuess = in.nextInt();

            if(userGuess == randomNumber) {
                System.out.println("Great Guess! You got it right!");
            }else {
                System.out.println("Sorry! that's not the number");
            }
        }
    }
}