package ArrayTest;
import java.util.Scanner;
import java.util.ArrayList;
public class TicTacToe
{
    public static void main(String[] args)
    {
       int userChoice = 0;
    System.out.println("Welcome to Tic Tac Toe");
    System.out.println("ALRIGHT LETS DO THIS I'M GONNA WIN");


    ArrayList<String> boards = new ArrayList<String>();
    for (int i = 1; i > 0; i--)
    {
        String[] board = {"7 8 9",
                            "4 5 6",
                            "1 2 3"};
        if(userChoice == 1 || userChoice == 2 || userChoice == 3 || userChoice == 4 || userChoice == 5
                || userChoice == 6 || userChoice == 7 || userChoice == 8 || userChoice == 9)
        {

        }
        for (int j = 0; j < board.length; ++j)
            System.out.println(board[j]);

        }

    }
}
