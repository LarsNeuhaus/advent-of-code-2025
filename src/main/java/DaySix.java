public class DaySix {

    public long firstPuzzle(String[][] grid) {
        long result = 0;
        for (int column = 0; column < grid[0].length; column++) {
            String operater = "";
            long sum = 0;

            for (int row = grid.length - 1; row >= 0; row--) {
                if (row == grid.length - 1) {
                    operater = grid[row][column];
                } else {
                    switch (operater) {
                        case "*":
                            if (sum == 0) {
                                sum = 1;
                            }
                            sum = sum * Long.parseLong(grid[row][column]);
                            break;
                        case "+":
                            sum += Long.parseLong(grid[row][column]);
                            break;
                    }
                }
            }

            result += sum;
        }

        return result;
    }
}
