// In order to use nonstandard library classes like Scanner
// we need to import them.
import java.util.Scanner;
public class ScannerExample{
  public static void main(String args[]){
    // Then we need to make an object of the scanner
    Scanner input = new Scanner(System.in);

    // Lastly, we can then use the scanner to take input
    System.out.println("Please enter the amount you sold:");
    int sales = input.nextInt();
    if(sales < 100000){
      System.out.println("You suck, you are fired!");
    }else if(sales >= 100000 && sales <= 300000){
        System.out.println("You are average, good job!");
    }else{
      System.out.println("Great job, take my money!");
    }

  }
}
