package hendricks.za.co.arrayutils;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by aziz on 2016/06/06.
 */
public class SmoothUtilTest {

    @Test
    public void should_smooth_as_per_scenario(){
       SmoothUtil smoothUtil = new SmoothUtil();
        double [] outputArray = smoothUtil.smooth(new double[] {40, 5, 200, 15}, 0, 100);

        assertEquals(outputArray[0], 40.0);
        assertEquals(outputArray[1], 5.0);
        assertEquals(outputArray[2], 10.0);
        assertEquals(outputArray[3], 15.0);
    }


    @Test
    public void should_smooth_when_nothing_in_range(){
        SmoothUtil smoothUtil = new SmoothUtil();
        double [] outputArray = smoothUtil.smooth(new double[] {0, 5, 100, 15}, 0, 100);

        assertEquals(outputArray[0], 0.0);
        assertEquals(outputArray[1], 5.0);
        assertEquals(outputArray[2], 100.0);
        assertEquals(outputArray[3], 15.0);
    }

    @Test
    public void should_smooth_when_no_left_neighbour(){
        SmoothUtil smoothUtil = new SmoothUtil();
        double [] outputArray = smoothUtil.smooth(new double[] {0, 5, 100, 15}, 1, 100);

        assertEquals(outputArray[0], 2.5);
        assertEquals(outputArray[1], 5.0);
        assertEquals(outputArray[2], 100.0);
        assertEquals(outputArray[3], 15.0);
    }

    @Test
    public void should_smooth_when_no_right_neighbour(){
        SmoothUtil smoothUtil = new SmoothUtil();
        double [] outputArray = smoothUtil.smooth(new double[] {2, 5, 100, 104}, 1, 100);

        assertEquals(outputArray[0], 2.0);
        assertEquals(outputArray[1], 5.0);
        assertEquals(outputArray[2], 100.0);
        assertEquals(outputArray[3], 50.0);
    }
}
