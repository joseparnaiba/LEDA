package problems.test;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import problems.FloorCeilBinarySearchImpl;

public class StudentProblemsTest {

    private FloorCeilBinarySearchImpl variavel;

    @Before
    public void setup(){
        variavel = new FloorCeilBinarySearchImpl();
    }

    @Test
    public void testCeilComValorEntreElementos(){
        Integer[] array = {4, 6, 8, 10};
        assertEquals(Integer.valueOf(8), variavel.ceil(array, 7)); // ceil de 7 é 8
    }

    @Test
    public void testFloorComValorEntreElementos(){
        Integer[] array = {4, 6, 8, 10};
        assertEquals(Integer.valueOf(6), variavel.floor(array, 7)); // floor de 7 é 6
    }

    @Test
    public void testCeilComValorExato(){
        Integer[] array = {4, 6, 8, 10};
        assertEquals(Integer.valueOf(6), variavel.ceil(array, 6)); // ceil de 6 é 6
    }

    @Test
    public void testFloorComValorExato(){
        Integer[] array = {4, 6, 8, 10};
        assertEquals(Integer.valueOf(6), variavel.floor(array, 6)); // floor de 6 é 6
    }

    @Test
    public void testSemFloor(){
        Integer[] array = {4, 6, 8, 10};
        assertEquals(null, variavel.floor(array, 3)); // menor que todos
    }

    @Test
    public void testSemCeil(){
        Integer[] array = {4, 6, 8, 10};
        assertEquals(null, variavel.ceil(array, 11)); // maior que todos
    }
}
