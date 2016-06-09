package hendricks.za.co.domain;

/**
 * DTO representation for Fill values used for REST API transport
 *
 * @author  Aziz Hendricks
 * @version 1.0
 * @since   2016-09-06
 */
public class FillInput {

    private int [] inputArray;
    private int arrayIndex;
    private int fillValue;

    public int getFillValue() {
        return fillValue;
    }

    public void setFillValue(int fillValue) {
        this.fillValue = fillValue;
    }

    public int[] getInputArray() {
        return inputArray;
    }

    public void setInputArray(int[] inputArray) {
        this.inputArray = inputArray;
    }

    public int getArrayIndex() {
        return arrayIndex;
    }

    public void setArrayIndex(int arrayIndex) {
        this.arrayIndex = arrayIndex;
    }
}
