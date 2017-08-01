//Create a string array of your friends. Loop through that array and print to the console adding "is my friend" to each friend's name. Ex: "Moriah is my friend"

import java.io.Console;

public class FriendList{
  public static void main(String[] args) {
    Console myConsole = System.console();
    String[] friends = {"Ned Stark", "Arya", "Jon Snow", "Khaleesi"};
    for(String friendDisplay : friends){
      System.out.println(friendDisplay + " " + "is my friend");
    }
  }
}
