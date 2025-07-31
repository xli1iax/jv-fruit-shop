package core.basesyntax.service.operation;

import core.basesyntax.dao.FruitShopDaoCsvImpl;
import core.basesyntax.model.FruitTransaction;

public class BalanceOperation implements OperationHandler {
    @Override
    public void process(FruitTransaction transaction) {
        FruitShopDaoCsvImpl fruitShopDaoCsvImpl = new FruitShopDaoCsvImpl();
        fruitShopDaoCsvImpl.update(transaction.getFruit(), transaction.getQuantity());
    }
}
