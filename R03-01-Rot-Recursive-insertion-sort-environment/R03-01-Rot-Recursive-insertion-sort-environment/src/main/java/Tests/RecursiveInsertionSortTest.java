package Tests;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import sorting.variationsOfInsertionsort.RecursiveInsertionSort;

public class RecursiveInsertionSortTest {

    private RecursiveInsertionSort<Integer> m;

    @Before
    public void setup(){
        m = new RecursiveInsertionSort<>();
    }

    @Test
    public void test1(){
        Integer[] array = {1, 2, 6, 9, 7};
        Integer[] expected = {1, 2, 6, 7, 9};

        m.sort(array, 0, array.length - 1);
        
        assertArrayEquals(expected, array);
    }
}
