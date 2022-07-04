package pattern.factorymethod;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DrinkFactory extends AbstractDrinkFactory {

  private Map<DrinkType, ItemData> manager = new ConcurrentHashMap<>();


  public DrinkFactory() {
    manager.put(DrinkType.COFFEE, new ItemData(3));
    manager.put(DrinkType.COKE, new ItemData(3));
  }

  @Override
  protected Drinkable createItem(DrinkType type) {
    Drinkable factory = null;
    switch (type) {
      case COFFEE:
        manager.get(DrinkType.COFFEE).count++;
        factory = new Conffee();
        break;
      case COKE:
        manager.get(DrinkType.COKE).count++;
        factory = new Coke();
        break;
      default:
        throw new RuntimeException("커피타입이 존재하지 않습니다.");
    }

    return factory;
  }

  @Override
  protected boolean isCreatable(DrinkType type) {
    ItemData itemData = manager.get(type);

    if (itemData == null) {
      return false;
    }

    if (itemData.maxCount <= itemData.count) {
      return false;
    }

    return true;
  }

  private class ItemData {
    private int maxCount;
    private int count;

    public ItemData(int maxCount) {
      this.maxCount = maxCount;
    }
  }
}
