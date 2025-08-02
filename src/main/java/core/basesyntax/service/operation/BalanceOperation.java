package core.basesyntax.service.operation;

import core.basesyntax.dao.FruitShopDaoCsvImpl;
import core.basesyntax.model.FruitTransaction;

public class BalanceOperation implements OperationHandler {
    @Override
    public void process(FruitTransaction transaction) {
        FruitShopDaoCsvImpl.getInstance().update(transaction.getFruit(), transaction.getQuantity());
    }
}
