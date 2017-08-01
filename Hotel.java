import java.io.Console;

public class Hotel{
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("In what season are you booking a stay?");
    String season = myConsole.readLine();
    System.out.println("On a weekend or weeknight?");
    String dayOfWeek = myConsole.readLine();

    boolean summer = season == "summer";
    boolean weekend = dayOfWeek == "weekend";

    if (summer && weekend) {
      System.out.println("Your stay is probably going to be pretty expensive. It's both peak travel season AND the weekend.");
    } else if (summer || weekend) {
      System.out.println("Your stay is probably going to be pretty expensive.");
    } else {
      System.out.println("Your stay may be costly, but it could certainly be worse!");
    }
  }
}
