import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(100, 200, "Fender", 6);
    }

    @Test
    public void guitarHasNumStrings() {
        assertEquals(6, guitar.getNumStrings());
    }

}
