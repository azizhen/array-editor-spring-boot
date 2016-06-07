package hendricks.za.co.arrayutils;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by aziz on 2016/06/06.
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
}
