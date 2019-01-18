
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
        System.out.println("Would you like to play craps? (y/n)");
        if(in.nextLine().equalsIgnoreCase("n"))
        {
            playing = false;
        }
        else
        {
            playing = true;
        }
        System.out.println("Would you like to review the rules before you begin?");
        if(in.nextLine().equalsIgnoreCase("n")){}
        else
        {
            System.out.println("A player rolls two six-sided dice and adds the numbers rolled together.");
            System.out.println("On this first roll, a 7 or an 11 automatically wins, and a 2, 3, or 12 automatically loses, and play is over. If a 4, 5, 6, 8, 9, or 10 are rolled on this first roll, that number becomes the 'point.'");
            System.out.println("The player continues to roll the two dice again until one of two things happens: either they roll the 'point' from that first roll again, in which case they win; or they roll a 7, in which case they lose.");
        }
        while(playing)
        {
            
            
        }
    }
}
