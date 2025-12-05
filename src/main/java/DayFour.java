import java.util.List;

public class DayFour {

    public int firstPuzzle(char[][] diagram) {
        int rollsOfPaper = 0;

        for (int row = 0; row < diagram.length; row++) {
            for (int column = 0; column < diagram[row].length; column++) {
                if (diagram[row][column] == '@') {
                    int countRollsInAdjacentPositions = 0;
                    if (isFirstRow(row)) {
                        if (isFirstColumn(column)) {
                            if (checkRight(column, diagram[row])) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkBelowRight(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkBelow(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                        } else if (isLastColumn(column, diagram[row])) {
                            if (checkBelow(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkBelowLeft(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkLeft(column, diagram[row])) {
                                countRollsInAdjacentPositions++;
                            }
                        } else {
                            if (checkRight(column, diagram[row])) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkBelowRight(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkBelow(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkBelowLeft(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkLeft(column, diagram[row])) {
                                countRollsInAdjacentPositions++;
                            }
                        }
                    } else if (isLastRow(diagram, row)) {
                        if (isFirstColumn(column)) {
                            if (checkAbove(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkAboveRight(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkRight(column, diagram[row])) {
                                countRollsInAdjacentPositions++;
                            }

                        } else if (isLastColumn(column, diagram[row])) {
                            if (checkAbove(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkLeft(column, diagram[row])) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkAboveLeft(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                        } else {
                            if (checkAbove(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkAboveRight(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkRight(column, diagram[row])) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkLeft(column, diagram[row])) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkAboveLeft(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }

                        }
                    }else {
                        if (isFirstColumn(column)) {
                            if (checkAbove(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkAboveRight(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkRight(column, diagram[row])) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkBelowRight(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkBelow(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                        } else if (isLastColumn(column, diagram[row])) {
                            if (checkAbove(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkBelow(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkBelowLeft(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkLeft(column, diagram[row])) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkAboveLeft(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }

                        } else {
                            if (checkAbove(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkAboveRight(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkRight(column, diagram[row])) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkBelowRight(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkBelow(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkBelowLeft(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkLeft(column, diagram[row])) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkAboveLeft(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                        }
                    }
                    if (countRollsInAdjacentPositions < 4) {
                        rollsOfPaper++;
                    }
                }

            }
        }
        return rollsOfPaper;
    }

    public int secondPuzzle(char[][] diagram) {
        int rollsOfPaper = 0;
        char[][] newDiagram = diagram.clone();

        for (int row = 0; row < diagram.length; row++) {
            for (int column = 0; column < diagram[row].length; column++) {
                if (diagram[row][column] == '@') {
                    int countRollsInAdjacentPositions = 0;
                    if (isFirstRow(row)) {
                        if (isFirstColumn(column)) {
                            if (checkRight(column, diagram[row])) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkBelowRight(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkBelow(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                        } else if (isLastColumn(column, diagram[row])) {
                            if (checkBelow(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkBelowLeft(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkLeft(column, diagram[row])) {
                                countRollsInAdjacentPositions++;
                            }
                        } else {
                            if (checkRight(column, diagram[row])) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkBelowRight(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkBelow(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkBelowLeft(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkLeft(column, diagram[row])) {
                                countRollsInAdjacentPositions++;
                            }
                        }
                    } else if (isLastRow(diagram, row)) {
                        if (isFirstColumn(column)) {
                            if (checkAbove(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkAboveRight(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkRight(column, diagram[row])) {
                                countRollsInAdjacentPositions++;
                            }

                        } else if (isLastColumn(column, diagram[row])) {
                            if (checkAbove(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkLeft(column, diagram[row])) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkAboveLeft(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                        } else {
                            if (checkAbove(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkAboveRight(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkRight(column, diagram[row])) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkLeft(column, diagram[row])) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkAboveLeft(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }

                        }
                    }else {
                        if (isFirstColumn(column)) {
                            if (checkAbove(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkAboveRight(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkRight(column, diagram[row])) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkBelowRight(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkBelow(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                        } else if (isLastColumn(column, diagram[row])) {
                            if (checkAbove(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkBelow(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkBelowLeft(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkLeft(column, diagram[row])) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkAboveLeft(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }

                        } else {
                            if (checkAbove(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkAboveRight(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkRight(column, diagram[row])) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkBelowRight(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkBelow(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkBelowLeft(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkLeft(column, diagram[row])) {
                                countRollsInAdjacentPositions++;
                            }
                            if (checkAboveLeft(diagram, row, column)) {
                                countRollsInAdjacentPositions++;
                            }
                        }
                    }
                    if (countRollsInAdjacentPositions < 4) {
                        rollsOfPaper++;
                        newDiagram[row][column] = '.';
                    }
                }

            }
        }

        if (rollsOfPaper == 0) {
            return rollsOfPaper;
        }
        return rollsOfPaper  + secondPuzzle(newDiagram);
    }

    private static boolean isLastColumn(int column, char[] diagram) {
        return column == diagram.length - 1;
    }

    private static boolean isLastRow(char[][] diagram, int row) {
        return row == diagram.length - 1;
    }

    private static boolean isFirstColumn(int column) {
        return column == 0;
    }

    private static boolean isFirstRow(int row) {
        return row == 0;
    }

    private static boolean checkAboveLeft(char[][] diagram, int row, int column) {
        return diagram[row - 1][column - 1] == '@';
    }

    private static boolean checkBelowLeft(char[][] diagram, int row, int column) {
        return diagram[row + 1][column - 1] == '@';
    }

    private static boolean checkBelowRight(char[][] diagram, int row, int column) {
        return diagram[row + 1][column + 1] == '@';
    }

    private static boolean checkAboveRight(char[][] diagram, int row, int column) {
        return diagram[row - 1][column + 1] == '@';
    }

    private static boolean checkLeft(int column, char[] diagram) {
        return diagram[column - 1] == '@';
    }

    private static boolean checkRight(int column, char[] diagram) {
        return diagram[column + 1] == '@';
    }

    private static boolean checkBelow(char[][] diagram, int row, int column) {
        return diagram[row + 1][column] == '@';
    }

    private static boolean checkAbove(char[][] diagram, int row, int column) {
        return diagram[row - 1][column] == '@';
    }
}
