package logic;

import checker.DecreasingDiagonalChecker;
import checker.HorizontalChecker;
import checker.IncreasingDiagonalChecker;
import checker.VerticalChecker;

public final class Checkers {
    private Checkers() {
    }

    public static boolean check(int x, int y, char[][] board){
        return new VerticalChecker().check(x,y,board) || new HorizontalChecker().check(x,y,board) ||
                new IncreasingDiagonalChecker().check(x,y,board) || new DecreasingDiagonalChecker().check(x,y,board);
    }
}
