
/**
 *
 * @author thesh
 */
public class BasicCalculator implements Calculator {

    private int output;

    public BasicCalculator() {
        this.output = 0;
    }

    // METHOD. Retrieves the claculator output
    @Override
    public int getValue() {
        return this.output;
    }

    // METHOD. Adds calculator input to current output result    
    public void add(int n) {
        this.output += n;
    }

    // METHOD. Subtracts calculator input to current output result   
    public void subtract(int n) {
        this.output = this.output - n;
    }

    // METHOD. Zeroes out calculator output
    public void zero() {
        this.output = 0;
    }

}
