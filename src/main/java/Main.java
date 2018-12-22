import logic.Checkers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.showBoard();

        Scanner scanner = new Scanner(System.in);

        boolean isWon = false;

        ToBeChanged currentChar = ToBeChanged.CIRCLE;

        while(!isWon){
            System.out.println("Podaj współrzędne:");
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();

//            if(number1<0 || number1>3 || number2<0 || number2>3){
//                System.out.println("Podano wartość spoza zakresu, wprowadź ponownie: ");
//                number1 = scanner.nextInt();
//                number2 = scanner.nextInt();
//            }

            board.putChar(number1, number2, currentChar);

            isWon = Checkers.check(number1,number2, board.getBoard());

            board.showBoard();

            if(currentChar.equals(ToBeChanged.CIRCLE)){
                currentChar=ToBeChanged.CROSS;
            }else{
                currentChar=ToBeChanged.CIRCLE;
            }
        }

    }
}