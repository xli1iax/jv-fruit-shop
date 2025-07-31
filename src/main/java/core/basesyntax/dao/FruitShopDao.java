package core.basesyntax.dao;

public interface FruitShopDao {
    void add(String fruit, int amount);

    void subtract(String fruit, int amount);

    void update(String fruit, int amount);
}
