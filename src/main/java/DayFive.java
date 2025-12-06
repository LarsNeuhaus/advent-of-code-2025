import java.util.*;

public class DayFive {

    public int firstPuzzle(List<String> database) {
        int amountOfFreshAvailableIngredient = 0;
        List<String> freshIngredientIdRanges = database.subList(0, database.indexOf(""));
        List<String> availableIngredientIds = database.subList(database.indexOf("") + 1, database.size());
        List<Long> removableIds = new ArrayList<>();

        for (String freshIngredientIdRange : freshIngredientIdRanges) {
            String[] split = freshIngredientIdRange.split("-");
            long min = Long.parseLong(split[0]);
            long max = Long.parseLong(split[1]);

            for (String availableIngredientId : availableIngredientIds) {
                long idAsLong = Long.parseLong(availableIngredientId);
                if (idAsLong >= min && idAsLong <= max && !removableIds.contains(idAsLong)) {
                    amountOfFreshAvailableIngredient++;
                    removableIds.add(idAsLong);
                }
            }
        }


        return amountOfFreshAvailableIngredient;
    }

    public long secondPuzzle(List<String> database) {
        List<String> freshIngredientIdRanges = database.subList(0, database.indexOf(""));
        freshIngredientIdRanges.sort(Comparator.comparingLong(s -> Long.parseLong(s.split("-")[0])));

        long totalIngredientIdsToBeFresh = 0;
        for (int i = 0; i < freshIngredientIdRanges.size() - 1; i++) {
            String[] split = freshIngredientIdRanges.get(i).split("-");
            long start = Long.parseLong(split[0]);
            long end = Long.parseLong(split[1]);

            long nextStart = Long.parseLong(freshIngredientIdRanges.get(i + 1).split("-")[0]);
            long nextEnd = Long.parseLong(freshIngredientIdRanges.get(i + 1).split("-")[1]);

            if (nextStart <= end) {
                long newEnd = Math.max(end, nextEnd);
                freshIngredientIdRanges.set(i, start + "-" + newEnd);
                freshIngredientIdRanges.remove(i + 1);
                i--;
            }
        }


        for (String s : freshIngredientIdRanges) {
            long start = Long.parseLong(s.split("-")[0]);
            long end = Long.parseLong(s.split("-")[1]);

            totalIngredientIdsToBeFresh += end - start + 1;
        }


        return totalIngredientIdsToBeFresh;
    }
}
