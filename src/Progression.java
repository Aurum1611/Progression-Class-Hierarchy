/**
 * abstract class which is a template for implementing various progressions
 *
 * @author Neeyat Lotlikar
 */
abstract public class Progression {

    protected long start;

    /**
     * Constructor for the class which assigns the value of the instance variable start
     *
     * @param start long value with which the progression should start
     * @author Neeyat Lotlikar
     */
    Progression(long start) {
        this.start = start;
    }

    /**
     * Parameterless constructor having a default value of 0
     *
     * @author Neeyat Lotlikar
     */
    Progression() {
        this(0);
    }

    /**
     * Method to get the next value of the progression
     *
     * @return long next value of the progression
     * @author Neeyat Lotlikar
     */
    public long nextValue() {
        long value = start;
        advance();
        return value;
    }

    /**
     * abstract method to update the value of the variable representing the current state of the progression
     *
     * @author Neeyat Lotlikar
     */
    abstract protected void advance();

    /**
     * Method to print the values of the current progression till n
     *
     * @author Neeyat Lotlikar
     */
    public void printProgression(long n) {
        for (int i = 0; i < n; i++)
            System.out.print(nextValue() + " ");
        System.out.println();
    }

}
