// In order to use nonstandard library classes like Scanner
// we need to import them.
import java.util.Scanner;
public class ScannerExample{
  public static void main(String args[]){
    // Then we need to make an object of the scanner
    Scanner input = new Scanner(System.in);

    // Lastly, we can then use the scanner to take input
    System.out.println("Please enter your grade:");
    int grade = input.nextInt();
    if(grade >= 65 && grade < 70){
      System.out.println("You Pass, but not by much!");
    }else{
      System.out.println("Better Luck Next Time!!!!");
    }

  }
}
