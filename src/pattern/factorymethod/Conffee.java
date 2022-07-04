package pattern.factorymethod;

public class Conffee implements Drinkable {

  public Conffee() {
  }

  @Override
  public String go() {
    System.out.println("커피 냠냠...");
    return "coffee";
  }
}
