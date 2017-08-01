//Create a String array containing 10 of your favorite foods. Use a for loop to print "I am eating" + foodItem for only 5 elements of that array. It should finish by saying "I'm full".
//USING FOR LOOP
public class FoodList{
  public static void main(String[] args) {
    String[] foodList = {"chips", "Waru", "chapati", "goat meat", "pizza", "bananas", "Avocado", "Chicken",
                          "Waru", "githeri"};
    for (Integer index = 0; index < 5; index++ ) {
      System.out.println("I am eating" + " " + " " + foodList[index]);
    }
      System.out.println("I'm full");
  }
}
