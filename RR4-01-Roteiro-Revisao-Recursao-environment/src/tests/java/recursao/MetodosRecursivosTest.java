import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import recursao.MetodosRecursivos;

public class MetodosRecursivosTest {

    private MetodosRecursivos m;

    @Before
    public void setup(){
        m = new MetodosRecursivos();
    }

    @Test
    public void test1(){
        int[]array  = {1,2,6,7,9};
        m.calcularSomaArray(array);
        assertEquals(26, m.calcularSomaArray(array));
    }

}
