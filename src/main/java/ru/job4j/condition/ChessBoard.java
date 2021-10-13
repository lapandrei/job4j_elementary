package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int rls = 0;
        boolean x1IsValid = (x1 >= 0) && (x1 <= 7);
        boolean x2IsValid = (x2 >= 0) && (x2 <= 7);
        boolean y1IsValid = (y1 >= 0) && (y1 <= 7);
        boolean y2IsValid = (y2 >= 0) && (y2 <= 7);
        if (x1IsValid && x2IsValid && y1IsValid && y2IsValid) {
            if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
                return Math.abs(x2 - x1);
            }
        }
        return rls;
    }
}
