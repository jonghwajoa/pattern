package pattern.factorymethod;

public class Coke implements Drinkable {
  @Override
  public String go() {
    System.out.println("Coke 냠냠");
    return "Coke";
  }
}
