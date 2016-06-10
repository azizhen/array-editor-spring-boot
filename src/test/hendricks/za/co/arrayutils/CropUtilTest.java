package hendricks.za.co.arrayutils;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by aziz on 2016/06/06.
 */
public class CropUtilTest {


    CropUtil cropUtil = null;
    @Before
    public void setup(){
        cropUtil = new CropUtil();
    }

    @Test
    public void should_crop_array(){

        int [] inputArray = new int[] {1,2,3,4,5,6,7,8,9};

        int [] outputArray = cropUtil.cropArray(inputArray, 3, 5);

        assertEquals(2, outputArray.length);

    }

    @Test
    public void should_default_startPosition(){

        int [] inputArray = new int[] {1,2,3,4,5,6,7,8,9};

        int [] outputArray = cropUtil.cropArray(inputArray, -13, 5);

        assertEquals(5, outputArray.length);

    }


    @Test
    public void should_default_endPosition(){

        int [] inputArray = new int[] {1,2,3,4,5,6,7,8,9};

        int [] outputArray = cropUtil.cropArray(inputArray, 3, 20);

        assertEquals(5, outputArray.length);

    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_illegalargument_if_array_null(){
        int [] inputArray = null;

        int [] outputArray = cropUtil.cropArray(inputArray, 3, 20);

    }
}
