import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DayFiveTest {

    @Test
    void firstPuzzle() throws IOException {
        Path path = Paths.get("src/main/resources/Input-DayFive.txt");

        List<String> database = Files.readAllLines(path);

        DayFive dayFive = new DayFive();

        Assertions.assertEquals(3, dayFive.firstPuzzle(database));
    }

    @Test
    void secondPuzzle() throws IOException {
        Path path = Paths.get("src/main/resources/Input-DayFive.txt");

        List<String> database = Files.readAllLines(path);

        DayFive dayFive = new DayFive();

        Assertions.assertEquals(14, dayFive.secondPuzzle(database));
    }
}