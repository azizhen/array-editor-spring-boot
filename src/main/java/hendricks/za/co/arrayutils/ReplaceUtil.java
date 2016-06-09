package hendricks.za.co.arrayutils;

/**
 * Array utility responsible for replacing values in arrays
 *
 * @author  Aziz Hendricks
 * @version 1.0
 * @since   2016-09-06
 */
public class ReplaceUtil {

    /**
     * Replace all instances of one value with another.
     * @param inputArray The input array that must be manipulated by the function
     * @param valueToReplace The value to replace
     * @param replacementValue The value that is used as replacement value
     * @return
     */
    public int [] replaceValuesInArray(int [] inputArray, int valueToReplace, int replacementValue){
        for(int i = 0;  i<inputArray.length; i++){
            if(inputArray[i] == valueToReplace){
                inputArray[i] = replacementValue;
            }
        }
        return inputArray;
    }
}
