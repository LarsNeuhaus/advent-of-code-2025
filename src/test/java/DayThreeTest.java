import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DayThreeTest {

    @Test
    public void firstPuzzle() throws IOException {
        DayThree dayThree = new DayThree();

        Path path = Paths.get("src/main/resources/Input-DayThree.txt");

        List<String> joltageRatings = Files.readAllLines(path);

        Assertions.assertEquals(17155, dayThree.firstPuzzle(joltageRatings));
    }

    @Test
    public void secondPuzzle() throws IOException {
        DayThree dayThree = new DayThree();

        Path path = Paths.get("src/main/resources/Input-DayThree.txt");

        List<String> joltageRatings = Files.readAllLines(path);

        Assertions.assertEquals(169685670469164L, dayThree.secondPuzzle(joltageRatings));
    }

}