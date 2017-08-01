import java.io.Console;

public class HasTwoDigits{
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Enter a two digit number:");
    String stringNumber = myConsole.readLine();
    Integer enteredNumber = Integer.parseInt(stringNumber);

    if (enteredNumber >= 10 && enteredNumber < 100) {
      System.out.println("Your number is an integer");
    } else {
      System.out.println("Your number is not an integer");
    }
  }
}
