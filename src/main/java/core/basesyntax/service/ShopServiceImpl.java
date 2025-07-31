package core.basesyntax.service;

import core.basesyntax.model.FruitTransaction;
import core.basesyntax.service.operation.OperationStrategy;
import java.util.List;

public class ShopServiceImpl implements ShopService {
    private OperationStrategy operationStrategy;

    public ShopServiceImpl(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public void setOperationStrategy(OperationStrategy operationStrategy) {
        if (operationStrategy == null) {
            throw new NullPointerException("operationStrategy is null");
        }

        this.operationStrategy = operationStrategy;
    }

    public OperationStrategy getOperationStrategy() {
        return operationStrategy;
    }

    @Override
    public void process(List<FruitTransaction> transactions) {
        transactions.forEach(transaction -> {
            operationStrategy.get(transaction.getOperation()).process(transaction);
        });
    }
}
