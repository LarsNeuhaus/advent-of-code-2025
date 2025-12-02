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

        Path path = Paths.get("src/main/resources/Input-DayOne.txt");

        List<String> rotations = Files.readAllLines(path);

        Assertions.assertEquals(3, dayThree.firstPuzzle(rotations));
    }

}