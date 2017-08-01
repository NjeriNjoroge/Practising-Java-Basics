import java.io.Console;

public class RatedR{
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("How old are you?");
    String stringUserAge = myConsole.readLine();
    Integer integerUserAge= Integer.parseInt(stringUserAge);
    if (integerUserAge >= 17) {
      System.out.println("You can see the movie");
    } else {
      System.out.println("Sorry, you cannot see the movie");
    }
  }
}
