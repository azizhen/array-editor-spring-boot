package hendricks.za.co.arrayutils;

import java.util.Arrays;

/**
 * Created by aziz on 2016/06/06.
 */
public class CropUtil {

    /**
     * * Crop: Change the size of the array (for example, if the input array is 100 elements, crop it so that the output
     * is only elements 10 to 20: the size of the output array is 10).
     *
     * @param inputArray
     * @param cropStartPosition
     * @param cropEndPosition
     * @return
     */
    public int [] cropArray(int [] inputArray, int cropStartPosition, int cropEndPosition){
       int [] outputArray = Arrays.copyOfRange(inputArray, cropStartPosition, cropEndPosition);
        return outputArray;
    }
}
