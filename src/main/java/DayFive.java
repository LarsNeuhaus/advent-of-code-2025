import java.util.ArrayList;
import java.util.List;

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
        long totalIngredientIdsToBeFresh = 0;
        for (String freshIngredientIdRange : freshIngredientIdRanges) {
            String[] split = freshIngredientIdRange.split("-");
            long min = Long.parseLong(split[0]);
            long max = Long.parseLong(split[1]);

            totalIngredientIdsToBeFresh += max - min + 1;
        }


        return totalIngredientIdsToBeFresh;
    }
}
