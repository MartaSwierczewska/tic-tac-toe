package logic;

import boardlogic.Board;
import other.Point;

public final class Checkers {

    private char currentChar;
    private static int signsInRow = 1;
    private int needToTheNextPoint;
    private Point currentPoint;
    private Point primaryPoint;

    public void calculateSignsInRow(Board board, Point point){

        setCurrentCharAndPoint(board, point);

        checkBoardFromTheNextPoint(board);

        changeCheckingSide();
        resetCurrentIndex();

        checkBoardFromTheNextPoint(board);
    }

    public static boolean winningCondition(Board board, Point point){
        calculateSignsInRow(board, point); //jak zrobic zeby kazdemu nie dawac static? :<

        if(signsInRow==3){
            return true;
        }
        return false;
    }

    private void setCurrentCharAndPoint(Board board, Point point){
        currentPoint = point;
        primaryPoint = point;
        currentChar = board.getBoard().get(point);
    }

    public void checkBoardFromTheNextPoint(Board board){
        goToTheNextPoint();
        checkSide(board);
    }

    public void checkSide(Board board){
        while(isCurrentCharEqualToFirstOne(board)){
            goToTheNextPoint();
            addOneSignInRow();
        }
    }

    protected void goToTheNextPoint() {  //dla kazdego inne przejscie
        this.currentPoint = primaryPoint.pointChange(1,0);
    }

    public boolean isCurrentCharEqualToFirstOne(Board board){
        return board.getBoard().get(currentPoint) != null && board.getBoard().get(primaryPoint) == currentChar;
    }

    protected void changeCheckingSide(){
        needToTheNextPoint *= -1;
    }

    protected void addOneSignInRow(){
        signsInRow++;
    }

    protected void resetCurrentIndex(){
        this.currentPoint = primaryPoint;
    }



    public void setNeedToTheNextPoint(int needToTheNextPoint) {
        this.needToTheNextPoint = needToTheNextPoint;
    }

    public void setCurrentChar(char currentChar) {
        this.currentChar = currentChar;
    }

    public void setSignsInRow(int signsInRow) {
        this.signsInRow = signsInRow;
    }

    public void setCurrentPoint(Point currentPoint) {
        this.currentPoint = currentPoint;
    }

    public int getSignsInRow() {
        return signsInRow;
    }

    public Point getCurrentPoint() {
        return currentPoint;
    }

    public Point getPrimaryPoint() {
        return primaryPoint;
    }
}
