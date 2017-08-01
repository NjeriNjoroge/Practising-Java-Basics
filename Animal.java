//USER LOGIC FOR AnimalShelter.java
import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class Animal{
  public static void main(String[] args) {
    Console myConsole = System.console();

    AnimalShelter dog = new AnimalShelter(2, "carnivorous", "Scooby");
    AnimalShelter bird = new AnimalShelter(5, "Bird", "Tweety");
    AnimalShelter cat = new AnimalShelter(10, "cat family", "pink panther" );

List<AnimalShelter> allAnimals = new ArrayList<AnimalShelter>();
allAnimals.add(dog);
allAnimals.add(bird);
allAnimals.add(cat);

boolean programRunning = true;

    while(programRunning){
      System.out.println("Welcome to Animal Shelter. Enter any of the following options to proceed: View All, Search Age, New Animal or Exit");

      String navigationChoice = myConsole.readLine();

if (navigationChoice.equals("View All")){
  for (AnimalShelter zoteAnimals : allAnimals){
    System.out.println("-----------");
    System.out.println(zoteAnimals.mName);
    System.out.println(zoteAnimals.mAge);
    System.out.println(zoteAnimals.mSpecies);
  }
} else if (navigationChoice.equals("Search Age")){
  System.out.println("What is the maximum age you are looking for?");
  String stringAnimalAge = myConsole.readLine();
  int yesAdopt= Integer.parseInt(stringAnimalAge);
  System.out.println("Here are some animals you can adopt:");
  for (AnimalShelter zoteAnimals : allAnimals){
    if (zoteAnimals.tooOld(yesAdopt)) {
      System.out.println("-----------");
      System.out.println(zoteAnimals.mName);
      System.out.println(zoteAnimals.mAge);
      System.out.println(zoteAnimals.mSpecies);
    }
  }
} else if (navigationChoice.equals("New Animal")) {
  System.out.println("What is the age?");
  int userAnimalShelterAge = Integer.parseInt(myConsole.readLine());
  System.out.println("What species?");
  String userAnimalShelterSpecies = myConsole.readLine();
  System.out.println("What is the animal name?");
  String userAnimalShelterName = myConsole.readLine();
  AnimalShelter userAnimalShelter = new AnimalShelter(userAnimalShelterAge, userAnimalShelterSpecies, userAnimalShelterName);
  allAnimals.add(userAnimalShelter);
  System.out.println("Alright, here are the details captured:");
  System.out.println( "----------------------" );
  System.out.println( userAnimalShelter.mAge );
  System.out.println( userAnimalShelter.mName );
  System.out.println( userAnimalShelter.mSpecies );
} else if (navigationChoice.equals("Exit")){
  programRunning = false;
} else {
  System.out.println("I'm sorry, we don't recognize your input");
}
    }
  }
}
