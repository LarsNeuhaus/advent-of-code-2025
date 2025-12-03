import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DayThree {

    public int firstPuzzle(List<String> joltageRatings) {
        int sumOfMaximumJoltage = 0;

        for (String joltageRating : joltageRatings) {
            int batterieOne = 0;
            int batterieTwo = 0;

            int batterieOneIndex = 0;

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
                }
            }

            String largestJoltage = batterieOne + String.valueOf(batterieTwo);

            sumOfMaximumJoltage += Integer.parseInt(largestJoltage);
        }


        return sumOfMaximumJoltage;
    }

    public long secondPuzzle(List<String> joltageRatings) {
        long sumOfMaximumJoltage = 0;

        for (String joltageRating : joltageRatings) {
            StringBuilder largestJoltage = new StringBuilder();
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < 12; i++) {
                String keyIndex = "index" + (11 - i + 1);
                String keyBatterie = "batterie" + (11 - i);
                if (i == 0) {
                    map.putAll(findLargestBatterie(joltageRating, 11 - i, 0));
                } else {
                    int startIndex = map.get(keyIndex);
                    map.putAll(findLargestBatterie(joltageRating, 11 - i, startIndex + 1));
                }
                largestJoltage.append(map.get(keyBatterie));
            }
            sumOfMaximumJoltage += Long.parseLong(largestJoltage.toString());
        }

        return sumOfMaximumJoltage;
    }

    private Map<String, Integer> findLargestBatterie(String joltageRating, int lengthModifier, int startIndex) {
        int largestBatterie = 0;
        int highestBatterieIndex = 0;

        for (int i = startIndex; i < joltageRating.length() - lengthModifier; i++) {
            int batterie = Integer.parseInt(String.valueOf(joltageRating.toCharArray()[i]));
            if (batterie > largestBatterie) {
                largestBatterie = batterie;
                highestBatterieIndex = i;
            }
        }

        Map<String, Integer> map = new HashMap<>();
        map.put("batterie" + lengthModifier, largestBatterie);
        map.put("index"  + lengthModifier, highestBatterieIndex);

        return map;
    }
}
