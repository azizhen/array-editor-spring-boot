package hendricks.za.co.arrayutils;

/**
 * Created by aziz on 2016/06/07.
 */
public class FillUtil {
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
