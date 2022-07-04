package pattern.factorymethod;

public class main {
  public static void main(String[] args) {
    AbstractDrinkFactory factory = new DrinkFactory();


    Drinkable coffee = factory.create(DrinkType.COFFEE);
    Drinkable coke = factory.create(DrinkType.COKE);
    factory.create(DrinkType.COFFEE);
    factory.create(DrinkType.COKE);
    factory.create(DrinkType.COFFEE);
    factory.create(DrinkType.COKE);
    factory.create(DrinkType.COKE);

    factory.create(DrinkType.COKE);

    coffee.go();
    coke.go();

  }
}
