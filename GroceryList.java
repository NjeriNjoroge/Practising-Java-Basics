import java.io.Console;


public class GroceryList{
  public static void main(String[] args) {
    Console myConsole = System.console();
    String[] myGroceryList = {"ice cream", "hot sauce", "pickles", "bananas", "cereal", "rice", "yogurt"};

    //EXAMPLE OF A FOR EACH LOOP
    // Integer[] groceryItemPrices = { 3, 6, 4, 2, 4, 4 };
    // for (String groceryItem : myGroceryList) {
    //   System.out.println(groceryItem);
    // }
    //
    // Integer total = 0;
    // for (Integer price : groceryItemPrices){
    //   total += price;
    // }
    //System.out.println("Your total for this shopping trip will be: $" + total);

//EXAMPLE OF A FOR LOOP
for (Integer index = 0; index < myGroceryList.length; index++ ) {
  System.out.println(myGroceryList[index]);
}

  }
}
