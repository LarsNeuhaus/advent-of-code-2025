import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DayFourTest {

    @Test
    void firstPuzzle() throws IOException {
        DayFour dayFour = new DayFour();

        Path path = Paths.get("src/main/resources/Input-DayFour.txt");

        List<String> lines = Files.readAllLines(path);

        int rows = lines.size();
        int cols = lines.getFirst().length();

        char[][] diagram = new char[rows][cols];

        for (int r = 0; r < rows; r++) {
            diagram[r] = lines.get(r).toCharArray();
        }

        Assertions.assertEquals(1518, dayFour.firstPuzzle(diagram));
    }

    @Test
    void secondPuzzle() throws IOException {
        DayFour dayFour = new DayFour();

        Path path = Paths.get("src/main/resources/Input-DayFour.txt");

        List<String> lines = Files.readAllLines(path);

        int rows = lines.size();
        int cols = lines.getFirst().length();

        char[][] diagram = new char[rows][cols];

        for (int r = 0; r < rows; r++) {
            diagram[r] = lines.get(r).toCharArray();
        }

        Assertions.assertEquals(43, dayFour.secondPuzzle(diagram));
    }
}