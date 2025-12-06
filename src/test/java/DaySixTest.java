import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DaySixTest {

    @Test
    void firstPuzzle() throws IOException {
        Path path = Paths.get("src/main/resources/Input-DaySix.txt");

        List<String> lines = Files.readAllLines(path);

        String[][] grid = new String[lines.size()][];

        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i).trim();
            grid[i] = line.split("\\s+");
        }

        DaySix daySix = new DaySix();

        Assertions.assertEquals(4277556, daySix.firstPuzzle(grid));
    }
}