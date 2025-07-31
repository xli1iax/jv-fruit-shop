package core.basesyntax.dao;

import core.basesyntax.storage.FruitShop;

public class FruitShopDaoCsvImpl implements FruitShopDao {
    @Override
    public void add(String fruit, int amount) {
        FruitShop.storage.put(fruit, FruitShop.storage.getOrDefault(fruit, 0) + amount);
    }

    @Override
    public void subtract(String fruit, int amount) {
        int currentAmount = FruitShop.storage.getOrDefault(fruit, 0);
        if (currentAmount < amount) {
            throw new RuntimeException("The amount of fruit is less than needed");
        }

        FruitShop.storage.put(fruit, currentAmount - amount);
    }

    @Override
    public void update(String fruit, int amount) {
        FruitShop.storage.put(fruit, amount);
    }
}
