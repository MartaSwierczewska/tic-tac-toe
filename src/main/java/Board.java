public class Board {
    private char[][] board;

    public Board() {
        this.board = createBoard();
    }

    public char[][] getBoard() {
        return board;
    }

    public char[][] createBoard(){
        char[][] tmp = new char[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                tmp[i][j] = '_';
            }
        }
        return tmp;
    }

    public void putChar(int x, int y, ToBeChanged tmp){
        board[y-1][x-1]=tmp.getValue();
    }

    public void showBoard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
