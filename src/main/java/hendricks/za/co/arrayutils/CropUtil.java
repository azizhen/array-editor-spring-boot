package hendricks.za.co.arrayutils;

import java.util.Arrays;

/**
 * Array utility responsible for cropping arrays
 *
 * @author  Aziz Hendricks
 * @version 1.0
 * @since   2016-09-06
 */
public class CropUtil {

    /**
     * * Crop: Change the size of the array (for example, if the input array is 100 elements, crop it so that the output
     * is only elements 10 to 20: the size of the output array is 10).
     *
     * @param inputArray The input array that must be manipulated by the function
     * @param cropStartPosition The start position from where Cropping must begin
     * @param cropEndPosition The end position from where Cropping must stop
     * @return The manipuated array after cropping has been applied
     */
    public int [] cropArray(int [] inputArray, int cropStartPosition, int cropEndPosition){
       return Arrays.copyOfRange(inputArray, cropStartPosition, cropEndPosition);
    }
}
