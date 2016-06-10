package hendricks.za.co.arrayutils;

/**
 * Array utility responsible for Smoothing arrays
 *
 * @author  Aziz Hendricks
 * @version 1.0
 * @since   2016-09-06
 */
public class SmoothUtil
{

    /**
     * Smooth: replace values smaller than a minimum and larger with a maximum with the average of their neighbours.
     * @param inputArray The input array that must be manipulated by the function
     * @param smoothMin The minimum value that must be compared to for smoothing eligibility
     * @param smoothMax The maximum value that must be compared to for smoothing eligibility
     * @return
     */
        public double [] smooth(double [] inputArray, int smoothMin, int smoothMax){

            validateInputValues(inputArray);

            for(int i = 0;  i<inputArray.length; i++){
               if(inputArray[i] < smoothMin || inputArray[i] > smoothMax){

                   double leftNeighbour = getLeftNeighbour(inputArray, i);

                   double rightNeighbour = getRightNeighbour(inputArray, i);

                   double average = calculateAverage(leftNeighbour, rightNeighbour);
                   inputArray[i] = average;

               }
            }
            return inputArray;
        }

    private double getRightNeighbour(double[] inputArray, int i) {
        double rightNeighbour = 0.0;
        if((i + 1) < inputArray.length){
            rightNeighbour = inputArray[i + 1];

        }
        return rightNeighbour;
    }

    private double getLeftNeighbour(double[] inputArray, int i) {
        double leftNeighbour = 0.0;
        if((i - 1) > 0){
            leftNeighbour = inputArray[i - 1];
        }
        return leftNeighbour;
    }

    private double calculateAverage(double leftNeighbour, double rightNeighbour) {
        return (leftNeighbour + rightNeighbour)/2;
    }

    private void validateInputValues(double[] inputArray) {

        if(inputArray == null){
            throw new IllegalArgumentException("The inputArray provided is null");
        }
    }
}
