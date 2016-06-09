package hendricks.za.co.domain;

/**
 * DTO representation for Crop values used for REST API transport
 *
 * @author  Aziz Hendricks
 * @version 1.0
 * @since   2016-09-06
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
