//business logic
class Vehicle{
  public int mPrice;
  public int mYear;
  public int mMiles;
  public String mBrand;
  public String mModel;

  public Vehicle(int year, String brand, String model, int miles, int price) {
     mYear = year;
     mBrand = brand;
     mModel = model;
     mMiles = miles;
     mPrice = price;
   }

  public boolean worthBuying(int maxPrice){
    return (mPrice < maxPrice);
  }
}
