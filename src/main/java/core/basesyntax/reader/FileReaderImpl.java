package core.basesyntax.reader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class FileReaderImpl implements FileReader {
    @Override
    public List<String> read(String filePath) {
        try {
            File file = new File(filePath);
            List<String> lines = Files.readAllLines(file.toPath());
            return lines.subList(1, lines.size());
        } catch (IOException e) {
            throw new RuntimeException("Can't read the file: " + filePath, e);
        }
    }
}
