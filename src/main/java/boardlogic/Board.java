package boardlogic;

import other.Point;
import other.ToBeChanged;

import java.util.HashMap;
import java.util.Map;

public class Board {

    private Map<Point, Character> board;

    public void createBoard(){

        board = new HashMap<>();

        for(int i = 1; i <= 3; i++){
            for(int j=1;j<=3;j++){
                Point point = new Point(i,j);
                board.put(point,'_');
            }
        }
    }

    public Map<Point, Character> getBoard() {
        return board;
    }


    public void putChar(int x,int y, ToBeChanged tmp){
//        if(board.get(new Point(x,y)!=null){
//            throw new PlaceTakenException();
//        }
        board.put(new Point(x,y), tmp.getValue());
    }

    public void showBoard(){
        for(int i = 1; i <= 3; i++){
            for(int j=1;j<=3;j++){
                Point point = new Point(i,j);
                System.out.print(board.get(point)+" ");
            }
            System.out.println();
        }
    }
}
