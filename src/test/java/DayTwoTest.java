import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DayTwoTest {

    @Test
    public void firstPuzzle() throws IOException {
        DayTwo dayTwo = new DayTwo();
        Path path = Paths.get("src/main/resources/Input-DayTwo.txt");

        String idRanges = Files.readString(path);
        Assertions.assertEquals(30599400849L, dayTwo.firstPuzzle(idRanges));
    }
}
