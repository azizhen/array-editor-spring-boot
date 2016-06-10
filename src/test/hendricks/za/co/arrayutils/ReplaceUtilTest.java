package hendricks.za.co.arrayutils;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Test Replace Util Functionality
 *
 * @author  Aziz Hendricks
 * @version 1.0
 * @since   2016-09-06
 */
public class ReplaceUtilTest {

    @Test
    public void should_replace_utils(){
        ReplaceUtil replaceUtil = new ReplaceUtil();
        int [] outputArray = replaceUtil.replaceValuesInArray(new int[] {1,2,3}, 2, 4);

        assertEquals(outputArray[0], 1);
        assertEquals(outputArray[1], 4);
        assertEquals(outputArray[2], 3);

    }

    @Test
    public void should_replace_nothing(){
        ReplaceUtil replaceUtil = new ReplaceUtil();
        int [] outputArray = replaceUtil.replaceValuesInArray(new int[] {1,2,3}, 5, 4);

        assertEquals(outputArray[0], 1);
        assertEquals(outputArray[1], 2);
        assertEquals(outputArray[2], 3);

    }

    @Test
    public void should_handel_negatives(){
        ReplaceUtil replaceUtil = new ReplaceUtil();
        int [] outputArray = replaceUtil.replaceValuesInArray(new int[] {-1,-22,-3}, -5, -34);

        assertEquals(outputArray[0], -1);
        assertEquals(outputArray[1], -22);
        assertEquals(outputArray[2], -3);

    }
}
