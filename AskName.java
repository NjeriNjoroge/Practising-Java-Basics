import java.io.Console;

public class AskName{
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("What is your name?");
    String nameGiven = myConsole.readLine();
    System.out.println("Nice to meet you" + " " + nameGiven);
  }
}
