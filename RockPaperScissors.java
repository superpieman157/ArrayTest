package ArrayTest;
import java.util.Scanner;
public class RockPaperScissors
{
    public static void main(String[] args) {
        int usersGuess = 0;
        int compSecret;

        String result = null;
        compSecret = (int)(Math.random() * 3 + 1);

        Scanner input = new Scanner(System.in);

        System.out.println("Lets play rock paper scissors, 1 for rock 2 for paper and 3 for scissors");
        usersGuess = input.nextInt();

        if(compSecret == 1)
        {

            if(usersGuess == 1)
            {
                result = "I Also Picked Rock, it's a tie!";
            }
            else if(usersGuess == 2)
            {
                result = "I picked rock, you win!";
            }
            else if(usersGuess == 3)
            {
                result = "I picked rock, you lose!";
            }
        }
        else if(compSecret == 2)
        {
            if(usersGuess == 1)
            {
                result = "I Picked paper, You Lose!";
            }
            else if(usersGuess == 2)
            {
                result = "I also picked paper, it's a tie!";
            }
            else if(usersGuess == 3)
            {
                result = "I picked paper, you win!";
            }
        }
        else if(compSecret == 3)
        {
            if(usersGuess == 1)
            {
                result = "I picked scissors, you win!";
            }
            else if(usersGuess == 2)
            {
                result = "I picked scissors, you lose!";
            }
            else if(usersGuess == 3)
            {
                result = "I also picked scissors, it's a tie!";
            }
        }

        randomNumber(result);

    }
    public static void randomNumber(String result)
    {
        System.out.println(result);
    }
}