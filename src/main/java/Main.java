import boardlogic.Board;
import logic.Checkers;
import other.ToBeChanged;
import other.Point;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Board board = new Board();
        board.createBoard();
        board.showBoard();

        Scanner scanner = new Scanner(System.in);

        boolean isWon = false;

        ToBeChanged currentChar = ToBeChanged.CIRCLE;

        while(!isWon){
            System.out.println("Podaj współrzędne:");
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();

            if(number1<0 || number1>3 || number2<0 || number2>3){
                System.out.println("Podano wartość spoza zakresu, wprowadź ponownie: ");
                number1 = scanner.nextInt();
                number2 = scanner.nextInt();
            }

            board.putChar(number2, number1, currentChar);

            isWon=Checkers.winningCondition(board, new Point(number2, number1));

            board.showBoard();

            if(currentChar.equals(ToBeChanged.CIRCLE)){
                currentChar=ToBeChanged.CROSS;
            }else{
                currentChar=ToBeChanged.CIRCLE;
            }
        }

    }
}