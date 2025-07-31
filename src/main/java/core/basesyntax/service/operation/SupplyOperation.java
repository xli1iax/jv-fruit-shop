package core.basesyntax.service.operation;

import core.basesyntax.dao.FruitShopDaoCsvImpl;
import core.basesyntax.model.FruitTransaction;

public class SupplyOperation implements OperationHandler {
    @Override
    public void process(FruitTransaction transaction) {
        FruitShopDaoCsvImpl fruitShopDaoCsvImpl = new FruitShopDaoCsvImpl();
        fruitShopDaoCsvImpl.add(transaction.getFruit(), transaction.getQuantity());
    }
}
