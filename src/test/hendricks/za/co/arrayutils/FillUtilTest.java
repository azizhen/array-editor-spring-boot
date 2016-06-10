package hendricks.za.co.arrayutils;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Test Fill Util Functionality
 *
 * @author  Aziz Hendricks
 * @version 1.0
 * @since   2016-09-06
 */
public class FillUtilTest {

    @Test
    public void should_return_filled_array(){
        int [] inputArray = new int[] {0, 2, 0, 1, 1, 1, 2, 2, 1};

        FillUtil fillUtil = new FillUtil();
        int [] outputArray = fillUtil.fill(inputArray, 4, 7);
        Assert.assertEquals(0, outputArray[0]);
        Assert.assertEquals(2, outputArray[1]);
        Assert.assertEquals(0, outputArray[2]);
        Assert.assertEquals(7, outputArray[3]);
        Assert.assertEquals(7, outputArray[4]);
        Assert.assertEquals(7, outputArray[5]);
        Assert.assertEquals(2, outputArray[6]);
        Assert.assertEquals(2, outputArray[7]);
        Assert.assertEquals(1, outputArray[8]);
    }

    @Test
    public void should_return_filled_array_one_adjacent(){
        int [] inputArray = new int[] {0, 2, 0, 2, 1, 1, 2, 2, 1};

        FillUtil fillUtil = new FillUtil();
        int [] outputArray = fillUtil.fill(inputArray, 4, 7);
        Assert.assertEquals(0, outputArray[0]);
        Assert.assertEquals(2, outputArray[1]);
        Assert.assertEquals(0, outputArray[2]);
        Assert.assertEquals(2, outputArray[3]);
        Assert.assertEquals(7, outputArray[4]);
        Assert.assertEquals(7, outputArray[5]);
        Assert.assertEquals(2, outputArray[6]);
        Assert.assertEquals(2, outputArray[7]);
        Assert.assertEquals(1, outputArray[8]);
    }


    @Test
    public void should_handle_position_zero(){
        int [] inputArray = new int[] {0, 2, 0, 2, 1, 1, 2, 2, 1};

        FillUtil fillUtil = new FillUtil();
        int [] outputArray = fillUtil.fill(inputArray, 0, 7);
        Assert.assertEquals(7, outputArray[0]);
        Assert.assertEquals(2, outputArray[1]);
        Assert.assertEquals(0, outputArray[2]);
        Assert.assertEquals(2, outputArray[3]);
        Assert.assertEquals(1, outputArray[4]);
        Assert.assertEquals(1, outputArray[5]);
        Assert.assertEquals(2, outputArray[6]);
        Assert.assertEquals(2, outputArray[7]);
        Assert.assertEquals(1, outputArray[8]);
    }

    @Test
    public void should_handle_position_end(){
        int [] inputArray = new int[] {0, 2, 0, 2, 1, 1, 2, 2, 1};

        FillUtil fillUtil = new FillUtil();
        int [] outputArray = fillUtil.fill(inputArray, 8, 7);
        Assert.assertEquals(0, outputArray[0]);
        Assert.assertEquals(2, outputArray[1]);
        Assert.assertEquals(0, outputArray[2]);
        Assert.assertEquals(2, outputArray[3]);
        Assert.assertEquals(1, outputArray[4]);
        Assert.assertEquals(1, outputArray[5]);
        Assert.assertEquals(2, outputArray[6]);
        Assert.assertEquals(2, outputArray[7]);
        Assert.assertEquals(7, outputArray[8]);
    }


    @Test(expected = IllegalArgumentException.class)
    public void should_throw_illegalargument_if_array_null(){
        int [] inputArray = null;

        FillUtil fillUtil = new FillUtil();
        int [] outputArray = fillUtil.fill(inputArray, 4, 7);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_illegalargument_if_index_not_in_range(){
        int [] inputArray = null;

        FillUtil fillUtil = new FillUtil();
        int [] outputArray = fillUtil.fill(inputArray, 50, 7);
    }
}
