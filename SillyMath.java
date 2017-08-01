import java.io.Console;

public class SillyMath{
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Give me a number");
    String stringGiven = myConsole.readLine();
    Integer numberGiven = Integer.parseInt(stringGiven);
    System.out.println("Give me another");
    String stringGiven2 = myConsole.readLine();
    Integer numberGiven2 = Integer.parseInt(stringGiven2);    
    Integer addedNumber = numberGiven + numberGiven2;
    String stringAddedNumber = Integer.toString(addedNumber);
    System.out.println("i have added both numbers. Result is" + " " + stringAddedNumber);
  }
}
