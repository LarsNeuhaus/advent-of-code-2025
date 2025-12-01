import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DayOneTest {

    @Test
    void firstPuzzle() throws IOException {
        DayOne dayOne = new DayOne();
        Path path = Paths.get("src/main/resources/Input-DayOne.txt");

        List<String> rotations = Files.readAllLines(path);

        assertEquals(1195, dayOne.firstPuzzle(rotations));
    }

    @Test
    void secondPuzzle() throws IOException {
        DayOne dayOne = new DayOne();
        Path path = Paths.get("src/main/resources/Input-DayOne.txt");

        List<String> rotations = Files.readAllLines(path);

        assertEquals(6770, dayOne.secondPuzzle(rotations));
    }
}