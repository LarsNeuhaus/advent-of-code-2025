import java.util.List;

public class DayOne {

    public int firstPuzzle(List<String> rotations) {
        int dial = 50;
        int countZeros = 0;

        for (String rotation : rotations) {
            String direction = rotation.substring(0, 1);
            int steps = Integer.parseInt(rotation.substring(1));

            switch (direction) {
                case "L":
                    dial -= steps;
                    break;
                case "R":
                    dial += steps;
                    break;
            }

            while (dial < 0) {
                dial += 100;
            }

            while (dial > 99) {
                dial -= 100;
            }

            if (dial == 0) {
                countZeros++;
            }
        }

        return countZeros;
    }
}
