//BUSINESS LOGIC FOR ANIMAL.java
class AnimalShelter{
  public int mAge;
  public String mSpecies;
  public String mName;

  public AnimalShelter(int age, String species, String name){
    mAge = age;
    mSpecies = species;
    mName = name;
  }

  public boolean tooOld(int maxAge){
    return (mAge < maxAge);
  }
}
