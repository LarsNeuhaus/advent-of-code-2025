import java.util.ArrayList;
import java.util.List;

public class DayTwo {

    public long firstPuzzle(String idRanges) {
        long countInvalidIds = 0;
        List<String> seperatedIdRanges = List.of(idRanges.split(","));
        for (String seperatedIdRange : seperatedIdRanges) {
            long min = Long.parseLong(seperatedIdRange.split("-")[0]);
            long max = Long.parseLong(seperatedIdRange.split("-")[1]);

            for (long i = min; i <= max; i++) {
                String currentId = String.valueOf(i);
                if (currentId.length() % 2 == 0) {
                    String currentIdFirstHalf = currentId.substring(0, currentId.length() / 2);
                    String currentIdSecondHalf = currentId.substring(currentId.length() / 2);
                    if (currentIdFirstHalf.equals(currentIdSecondHalf)) {
                        countInvalidIds += i;
                    }
                }
            }
        }
        return countInvalidIds;
    }

    public long secondPuzzle(String idRanges) {
        long countInvalidIds = 0;
        List<String> seperatedIdRanges = List.of(idRanges.split(","));
        for (String seperatedIdRange : seperatedIdRanges) {
            long min = Long.parseLong(seperatedIdRange.split("-")[0]);
            long max = Long.parseLong(seperatedIdRange.split("-")[1]);

            for (long i = min; i <= max; i++) {
                String currentId = String.valueOf(i);

                int divisor = 2;
                List<Boolean> check = new ArrayList<>();
                while (divisor <= currentId.length()) {
                    if (currentId.length() % divisor == 0) {
                        boolean isEqual = true;
                        List<String> splittetCurrentId = new ArrayList<>();
                        for (int j = 0; j < divisor; j++) {
                            int endIndex = (currentId.length() / divisor) * (j + 1);
                            int beginIndex = j * (currentId.length() / divisor);

                            String substring = currentId.substring(beginIndex, endIndex);
                            splittetCurrentId.add(substring);
                        }

                        for (String s : splittetCurrentId) {
                            if (!s.equals(splittetCurrentId.getFirst())) {
                                isEqual = false;
                                break;
                            }
                        }
                        check.add(isEqual);
                    }
                    divisor++;
                }
                if (!check.isEmpty()) {
                    countInvalidIds += i;
                }

            }
        }
        return countInvalidIds;
    }
}
