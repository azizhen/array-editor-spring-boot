package hendricks.za.co.domain;

/**
 * DTO representation for Smooth values used for REST API transport
 *
 * @author  Aziz Hendricks
 * @version 1.0
 * @since   2016-09-06
 */
public class SmoothInput {

    private double [] inputArray;
    private int smoothMin;
    private int smoothMax;

    public int getSmoothMax() {
        return smoothMax;
    }

    public void setSmoothMax(int smoothMax) {
        this.smoothMax = smoothMax;
    }

    public double[] getInputArray() {
        return inputArray;
    }

    public void setInputArray(double[] inputArray) {
        this.inputArray = inputArray;
    }

    public int getSmoothMin() {
        return smoothMin;
    }

    public void setSmoothMin(int smoothMin) {
        this.smoothMin = smoothMin;
    }

}
