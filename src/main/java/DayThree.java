import java.util.List;

public class DayThree {

    public int firstPuzzle(List<String> joltageRatings) {
        int sumOfMaximumJoltage = 0;

        for (String joltageRating : joltageRatings) {
            int batterieOne = 0;
            int batterieTwo = 0;

            int batterieOneIndex = 0;
            int batterieTwoIndex = 0;

            for (int i = 0; i < joltageRating.length() - 1; i++) {
                int batterie = Integer.parseInt(String.valueOf(joltageRating.toCharArray()[i]));
                if (batterie > batterieOne) {
                    batterieOne = batterie;
                    batterieOneIndex = i;
                }
            }

            for (int i = batterieOneIndex + 1; i < joltageRating.length(); i++) {
                int batterie = Integer.parseInt(String.valueOf(joltageRating.toCharArray()[i]));
                if (batterie > batterieTwo) {
                    batterieTwo = batterie;
                    batterieTwoIndex = i;
                }
            }

            String largestJoltage = batterieOne + String.valueOf(batterieTwo);

            sumOfMaximumJoltage += Integer.parseInt(largestJoltage);
        }


        return sumOfMaximumJoltage;
    }
}
