
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
        side = rnd.nextInt(5)+1;
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
}
