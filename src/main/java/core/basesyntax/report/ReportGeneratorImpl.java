package core.basesyntax.report;

import core.basesyntax.storage.FruitShop;
import java.util.Map;

public class ReportGeneratorImpl implements ReportGenerator {
    @Override
    public String getReport() {
        StringBuilder sb = new StringBuilder();
        sb.append("fruit,quantity");
        for (Map.Entry<String, Integer> entry : FruitShop.storage.entrySet()) {
            sb.append(entry.getKey())
                    .append(",")
                    .append(entry.getValue())
                    .append(System.lineSeparator());
        }
        return sb.toString();
    }
}
