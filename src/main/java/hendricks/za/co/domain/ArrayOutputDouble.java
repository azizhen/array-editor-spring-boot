package hendricks.za.co.domain;

/**
 * DTO representation for array of doubles used for REST API transport
 *
 * @author  Aziz Hendricks
 * @version 1.0
 * @since   2016-09-06
 */
public class ArrayOutputDouble {

    private double [] outputArray;
    public double[] getOutputArray() {
        return outputArray;
    }

    public void setOutputArray(double[] outputArray) {
        this.outputArray = outputArray;
    }


}
