
/**
 * Models a six-sided die.
 *
 * @author Dexter Knaack
 * @version 2019-1-18
 */

import java.util.Random;

public class Die
{
    int side;
    Random rnd;
    
    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        side = 0;
        rnd = new Random();
    }

    /**
     * Rolls the die.
     */
    public void roll()
    {
        side = rnd.nextInt(6)+1;
    }
    
    /**
     * Returns the side of the die
     * 
     * @return  the side of the die
     */
    public int get()
    {
        return side;
    }
    
    public String toString()
    {
        String toReturn = "";
        //row 1
        toReturn += "+-----------+\n";
        //row 2
        //toReturn += "|           |\n";
        //row 3
        toReturn += "|  "; 
        if(side > 1){toReturn += "o";}else{toReturn += " ";}
        toReturn += "     ";
        if(side > 3){toReturn += "o";}else{toReturn += " ";}
        toReturn += "  |\n";
        //row 4
        //toReturn += "|           |\n";
        //row 5
        toReturn += "|  "; 
        if(side == 6){toReturn += "o";}else{toReturn += " ";}
        toReturn += "  ";
        if(side == 3||side == 5||side == 1){toReturn += "o";}else{toReturn += " ";}
        toReturn += "  ";
        if(side == 6){toReturn += "o";}else{toReturn += " ";}
        toReturn += "  |\n";
        //row 6
        //toReturn += "|           |\n";
        //row 7
        toReturn += "|  ";
        if(side > 3){toReturn += "o";}else{toReturn += " ";}
        toReturn += "     ";
        if(side > 1){toReturn += "o";}else{toReturn += " ";}
        toReturn += "  |\n";
        //row 8
        toReturn += "+-----------+\n";
        
        return toReturn;
    }
}
