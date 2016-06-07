package hendricks.za.co.arrayutils;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by aziz on 2016/06/06.
 */
public class CropUtilTest {

    @Test
    public void should_crop_array(){
        CropUtil cropUtil = new CropUtil();

        int [] inputArray = new int[] {1,2,3,4,5,6,7,8,9};

        int [] outputArray = cropUtil.cropArray(inputArray, 3, 5);

        assertEquals(2, outputArray.length);

    }
}
