package hendricks.za.co.domain;

/**
 * DTO representation for Replace values used for REST API transport
 *
 * @author  Aziz Hendricks
 * @version 1.0
 * @since   2016-09-06
 */
public class ReplaceInput {

    private int [] inputArray;
    private int numberToReplace;
    private int replacementNumber;

    public int getReplacementNumber() {
        return replacementNumber;
    }

    public void setReplacementNumber(int replacementNumber) {
        this.replacementNumber = replacementNumber;
    }

    public int[] getInputArray() {
        return inputArray;
    }

    public void setInputArray(int[] inputArray) {
        this.inputArray = inputArray;
    }

    public int getNumberToReplace() {
        return numberToReplace;
    }

    public void setNumberToReplace(int numberToReplace) {
        this.numberToReplace = numberToReplace;
    }

}
