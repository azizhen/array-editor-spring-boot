package hendricks.za.co.domain;

/**
 * DTO representation for array of integers used for REST API transport
 *
 * @author  Aziz Hendricks
 * @version 1.0
 * @since   2016-09-06
 */
public class ArrayOutput {
    private int [] outputArray;
    public int[] getOutputArray() {
        return outputArray;
    }
    public void setOutputArray(int[] outputArray) {
        this.outputArray = outputArray;
    }

}
