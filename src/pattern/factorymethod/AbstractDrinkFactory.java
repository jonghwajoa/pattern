package pattern.factorymethod;

public abstract class AbstractDrinkFactory {

  public Drinkable create(DrinkType type) {
    Drinkable drinkable = null;

    if (isCreatable(type)) {
      drinkable = createItem(type);
    } else {
      System.out.println("품절입니다.....");
    }

    return drinkable;
  }

  protected abstract Drinkable createItem(DrinkType type);

  protected abstract boolean isCreatable(DrinkType type);
}
