
/**
 * Runs a game of Craps.
 *
 * @author Dexter Knaack
 * @version 2019-1-18
 */

import java.util.Scanner;

public class Craps
{
    // instance variables
    static Dice dice = new Dice();
    static int point = 0;
    static boolean playing = true;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Would you like to review the rules before you begin?");
        if(in.nextLine().equalsIgnoreCase("n")){}
        else
        {
            giveInstructions();
        }
        while(playing)
        {
            System.out.println("Would you like to play craps? (Y/n)");
            String result = in.nextLine();
            if(result.equals("")||result.substring(0,1).equalsIgnoreCase("y"))
            {
                playing = true;
            }
            else
            {
                playing = false;
                break;
            }
            System.out.println("Press <Enter> to roll...");
            String pause = in.nextLine();
            while(!pause.equals(""))
            {
                System.out.println("Press <Enter> to roll...");
                pause = in.nextLine();
            }
            int roll = roll();
            if(roll == 7 || roll == 11)
            {
                System.out.println("You Win! Congrats!");
            }
            else if(roll == 2 || roll == 3 || roll == 12)
            {
                System.out.println("You Lose! Awwww!");
            }
            else
            {
                point = roll;
                System.out.println("The point is now: " + point);
                boolean end = false;
                while(!end)
                {
                    System.out.println("Press <Enter> to roll...");
                    pause = in.nextLine();
                    while(!pause.equals(""))
                    {
                        System.out.println("Press <Enter> to roll...");
                        pause = in.nextLine();
                    }
                    roll = roll();
                    if(roll==point)
                    {
                        System.out.println("You Win! Congrats!");
                        end = true;
                    }
                    else if(roll==7)
                    {
                        System.out.println("You Lose! Awwww!");
                        end = true;
                    }
                }
            }
            
        }
    }

    public static void giveInstructions()
    {
        System.out.println("A player rolls two six-sided dice and adds the numbers rolled together.");
        System.out.println("On this first roll, a 7 or an 11 automatically wins, and a 2, 3, or 12 automatically loses, and play is over. If a 4, 5, 6, 8, 9, or 10 are rolled on this first roll, that number becomes the 'point.'");
        System.out.println("The player continues to roll the two dice again until one of two things happens: either they roll the 'point' from that first roll again, in which case they win; or they roll a 7, in which case they lose.");
    }

    public static int roll()
    {
        int[] rolls = dice.roll();
        System.out.println("You rolled: " + rolls[0] + ", " + rolls[1]);
        int sum = rolls[0] + rolls[1];
        return sum;
    }
}
