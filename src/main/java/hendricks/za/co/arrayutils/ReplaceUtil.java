package hendricks.za.co.arrayutils;

/**
 * Created by aziz on 2016/06/06.
 */
public class ReplaceUtil {

    public int [] replaceValuesInArray(int [] inputArray, int valueToReplace, int replacementValue){
        for(int i = 0;  i<inputArray.length; i++){
            if(inputArray[i] == valueToReplace){
                inputArray[i] = replacementValue;
            }
        }
        return inputArray;
    }
}
