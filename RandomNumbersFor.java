import java.util.Random;
public class RandomNumbersFor {
   public static void main(String[] args) {
       Random rand = new Random();
       final int MAX = 10;
       final int MIN = 1;
       int randomNumber;
       for (int i = 0; i < 100; i++) {
           randomNumber = rand.nextInt(MAX) + MIN;
           System.out.println(randomNumber);
       }
   }
}