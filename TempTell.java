import java.io.Console;

public class TempTell{
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("What is your weather in Celcius?");
    String answer = myConsole.readLine();
    Integer temp = Integer.parseInt(answer);

    if (temp < 50) {
      System.out.println("Carry a sweater it will be cold");
    } else {
      System.out.println("Carry water it will be hot");
    }
   }
}
