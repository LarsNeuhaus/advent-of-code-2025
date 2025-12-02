import java.util.List;

public class DayTwo {

    public long firstPuzzle(String idRanges) {
        long countInvalidIds = 0;
        List<String> seperatedIdRanges = List.of(idRanges.split(","));
        for (String seperatedIdRange : seperatedIdRanges) {
            long min = Long.parseLong(seperatedIdRange.split("-")[0]);
            long max = Long.parseLong(seperatedIdRange.split("-")[1]);

            for (long i = min; i <= max ; i++) {
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
}
