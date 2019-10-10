// In order to use nonstandard library classes like Scanner
// we need to import them.
import java.util.Scanner;
public class SwitchExample{
  public static void main(String args[]){
    // Then we need to make an object of the scanner
    Scanner input = new Scanner(System.in);
    System.out.println("Pick a verse 1 to 5");
    int choice = input.nextInt();
    switch(choice){
      case 5: System.out.println("5 Golden Rings");
      case 4: System.out.println("4 Calling Birds");
      case 3: System.out.println("3 French Hens");
      case 2: System.out.println("2 Turtle Doves");
      case 1: System.out.println("1 Partridge in a Pear Tree");
              break;
      default: System.out.println("Idiot, enter a valid number darn it!");
    }

  }
}
