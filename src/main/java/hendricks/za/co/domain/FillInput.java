package hendricks.za.co.domain;

/**
 * Created by aziz on 2016/06/07.
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
