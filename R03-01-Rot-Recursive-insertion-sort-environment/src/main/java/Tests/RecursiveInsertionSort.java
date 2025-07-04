package Tests;


import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RecursiveInsertionSort {

    private RecursiveInsertionSort m;

    @Before
    public void setup(){
        m = new RecursiveInsertionSort();
    }

    @Test
    public void test1(){
        int[]array = {1,2,6,9,7};
        m.sort(array,0,5);
        assertEquals({1,2,6,7,9}, m.sort(array,0,5));
    }
}
