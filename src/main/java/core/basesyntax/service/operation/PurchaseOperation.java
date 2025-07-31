package core.basesyntax.service.operation;

import core.basesyntax.dao.FruitShopDaoCsvImpl;
import core.basesyntax.model.FruitTransaction;

public class PurchaseOperation implements OperationHandler {
    @Override
    public void process(FruitTransaction transaction) {
        FruitShopDaoCsvImpl fruitShopDaoCsvImpl = new FruitShopDaoCsvImpl();
        fruitShopDaoCsvImpl.subtract(transaction.getFruit(), transaction.getQuantity());
    }
}
