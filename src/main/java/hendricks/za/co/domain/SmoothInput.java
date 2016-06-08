package hendricks.za.co.domain;

/**
 * Created by aziz on 2016/06/07.
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
