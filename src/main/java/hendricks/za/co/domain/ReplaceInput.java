package hendricks.za.co.domain;

/**
 * Created by aziz on 2016/06/07.
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
