
/**
 * Rolls 2 dice.
 *
 * @author Dexter Knaack
 * @version 2019-1-18
 */
public class Dice
{
    // instance variables - replace the example below with your own
    Die die1;
    Die die2;

    /**
     * Constructor for objects of class Dice
     */
    public Dice()
    {
        // initialise instance variables
        die1 = new Die();
        die2 = new Die();
    }

    public int[] roll()
    {
        die1.roll();
        System.out.println(die1);
        die2.roll();
        System.out.println(die2);
        int[] result = {die1.get(), die2.get()};
        return result;
    }
}
