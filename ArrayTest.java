import java.util.Scanner;


public class ArrayTest
{
    public static void main(String[] args)
    {
        int low = 100;
        int high = 0;
        int avg = 0;
        int total = 0;
        int count = 0;
        int userScore;
        int userExit = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please input score use 999 to exit");
            userScore = input.nextInt();

            if(userScore > high)
            {
                high = userScore;
                count = count + 1;
                total = total + userScore;
            }
            else if(userScore < low)
            {
                low = userScore;
                count = count + 1;
                total = total + userScore;
            }
            else if(userScore <= high && userScore >= low)
            {
                total = total + userScore;
                count = count + 1;
            }
            else if(userScore < 0 || userScore > 100)
            {
                System.out.println("Error");
            }
            System.out.println("999 to exit? 0 to keep going");
            userExit = input.nextInt();
        }while(userExit < 999);

        avg = total / count;
///yeet
        display(low, high, avg,count);
    }
    public static void display(int low, int high, int avg, int count)
    {
        System.out.println("There Were " + count + " Tests, The Lowest Score Was " + low
                + " And The Highest Was " + high + " The Average Was " + avg + " ");
    }

}
