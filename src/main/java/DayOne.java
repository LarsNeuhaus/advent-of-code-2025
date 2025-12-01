import java.util.List;

public class DayOne {

    private int dial = 50;
    private final int max = 99;
    private final int min = 0;
    private int countZeros = 0;

    public int firstPuzzle(List<String> rotations) {
        for (String rotation : rotations) {
            String direction = getDirection(rotation);
            int steps = Integer.parseInt(rotation.substring(1));

            switch (direction) {
                case "R":
                    for (int i = 0; i < steps; i++) {
                        if (isDialMax()) {
                            setDialToMin();
                        } else {
                            increaseDialByOne();
                        }
                    }
                    break;
                case "L":
                    for (int i = 0; i < steps; i++) {
                        if (isDialMin()) {
                            setDialToMax();
                        } else {
                            decreaseDialByOne();
                        }
                    }
                    break;
            }

            if (isDialMin()) {
                increaseCountZerosByOne();
            }
        }

        return countZeros;
    }

    public int secondPuzzle(List<String> rotations) {
        for (String rotation : rotations) {
            String direction = getDirection(rotation);
            int steps = Integer.parseInt(rotation.substring(1));

            switch (direction) {
                case "R":
                    for (int i = 0; i < steps; i++) {
                        if (isDialMax()) {
                            setDialToMin();
                            increaseCountZerosByOne();
                        } else {
                            increaseDialByOne();
                        }
                    }
                    break;
                case "L":
                    for (int i = 0; i < steps; i++) {
                        if (isDialMin()) {
                            setDialToMax();
                        } else {
                            decreaseDialByOne();
                            if (isDialMin()) {
                                increaseCountZerosByOne();
                            }
                        }
                    }
                    break;
            }
        }

        return countZeros;
    }

    private void setDialToMax() {
        dial = 99;
    }

    private boolean isDialMax() {
        return dial == max;
    }

    private boolean isDialMin() {
        return dial == min;
    }

    private String getDirection(String rotation) {
        return rotation.substring(0, 1);
    }

    private void setDialToMin() {
        dial = 0;
    }

    private void increaseDialByOne() {
        dial++;
    }

    private void decreaseDialByOne() {
        dial--;
    }

    private void increaseCountZerosByOne() {
        countZeros++;
    }

}
