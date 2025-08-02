package core.basesyntax.service.operation;

import core.basesyntax.dao.FruitShopDaoCsvImpl;
import core.basesyntax.model.FruitTransaction;

public class ReturnOperation implements OperationHandler {
    @Override
    public void process(FruitTransaction transaction) {

        FruitShopDaoCsvImpl.getInstance().add(transaction.getFruit(), transaction.getQuantity());
    }
}
