package hendricks.za.co.arrayutils;

/**
 * Created by aziz on 2016/06/08.
 */
public class SmoothUtil
{

    /**
     * Smooth: replace values smaller than a minimum and larger with a maximum with the average of their neighbours.
     * @param inputArray
     * @param smoothMin
     * @param smoothMax
     * @return
     */
        public double [] smooth(double [] inputArray, int smoothMin, int smoothMax){
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
}
