package hendricks.za.co.arrayutils;

/**
 * Array utility responsible for filling arrays
 *
 * @author  Aziz Hendricks
 * @version 1.0
 * @since   2016-09-06
 */
public class FillUtil {

    /**
     * Similar to replace: Starting at a given index in an array, replace adjacent elements if their value is
     * the same (similar to the "paint bucket" fill tool in image editing software)
     * @param inputArray The input array that must be manipulated by the function
     * @param arrayIndex The given index that must be used as the anchor for replacing adjacent elements
     * @param fillValue The value to apply the fill to
     * @return
     */
    public int[] fill(int[] inputArray, int arrayIndex, int fillValue) {

        validateInputValues(inputArray, arrayIndex);

        updateAdjacentLeft(inputArray, arrayIndex, fillValue);

        updateAdjacentRight(inputArray, arrayIndex, fillValue);

        inputArray[arrayIndex] = fillValue;

        return inputArray;
    }

    private void validateInputValues(int[] inputArray, int arrayIndex) {

        if(inputArray == null){
            throw new IllegalArgumentException("The inputArray provided is null");
        }

        if(arrayIndex < 0 && arrayIndex >= inputArray.length){
            throw new IllegalArgumentException("The array index provided does not exist in input array");
        }
    }

    private void updateAdjacentRight(int[] inputArray, int arrayIndex, int fillValue) {
        if((arrayIndex + 1) < inputArray.length  && inputArray[arrayIndex + 1] ==  inputArray[arrayIndex]){
            inputArray[arrayIndex + 1] = fillValue;
        }
    }

    private void updateAdjacentLeft(int[] inputArray, int arrayIndex, int fillValue) {
        if((arrayIndex - 1) > 0 && inputArray[arrayIndex - 1] ==  inputArray[arrayIndex]){
            inputArray[arrayIndex - 1] = fillValue;

        }
    }
}
