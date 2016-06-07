package hendricks.za.co.domain;

/**
 * Created by aziz on 2016/06/07.
 */
public class CropInput {

    private int [] inputArray;
    private int cropStartPosition;
    private int cropEndPosition;

    public int getCropEndPosition() {
        return cropEndPosition;
    }

    public void setCropEndPosition(int cropEndPosition) {
        this.cropEndPosition = cropEndPosition;
    }

    public int getCropStartPosition() {
        return cropStartPosition;
    }

    public void setCropStartPosition(int cropStartPosition) {
        this.cropStartPosition = cropStartPosition;
    }

    public int[] getInputArray() {
        return inputArray;
    }

    public void setInputArray(int[] inputArray) {
        this.inputArray = inputArray;
    }

}
