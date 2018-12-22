package checker;

public class DecreasingDiagonalChecker implements Checkable{
    @Override
    public boolean check(int x, int y, char[][] board) {




        if(y == x && board[x-1][y-1] == board[x%3][y%3] &&
                board[x-1][y-1] == board[(x+1)%3][(y+1)%3]){
            System.out.println(board[x-1][y-1]+" won :)");
            return true;
        }
        return false;
    }
}
