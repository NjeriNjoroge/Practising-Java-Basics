import java.io.Console;

public class MealTime{
  public static void main(String[] args) {
  askWhatYouAteFor("breakfast");
  askWhatYouAteFor("lunch");
  askWhatYouAteFor("supper");
  /*
    String yourBreakfast = myConsole.readLine();
    System.out.println("You had" + " " + yourBreakfast + " " + "for breakfast");
    //asking about lunch
    askWhatYouAteFor("lunch");
    String yourLunch = myConsole.readLine();
    System.out.println("You had" + " " + yourLunch + " " + "for lunch");
    //asking about dinner
    askWhatYouAteFor("dinner");
    String yourDinner = myConsole.readLine();
    System.out.println("You had" + " " + yourDinner + " " + "for dinner");
    */
  }
  public static void askWhatYouAteFor(String meal){
    Console myConsole = System.console();
    System.out.println("What did you eat for" +" " + meal + "?");
    String yourMeal = myConsole.readLine();
    System.out.println("You ate" + " "+ yourMeal+ " "+"at"+" "+ meal);
  }
}
