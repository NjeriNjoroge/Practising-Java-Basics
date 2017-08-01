//practice with FOR LOOP

import java.io.Console;

public class LeapYear{
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("What year were you born in?");
    String stringBirthYear = myConsole.readLine();
    Integer birthYear = Integer.parseInt(stringBirthYear);
    System.out.println("You were alive during these leap years");
    for (Integer year = birthYear; year < 2017 ; year++ ) {
      if (year % 4 == 0) {
        System.out.println(year);
      }
    }
  }
}
