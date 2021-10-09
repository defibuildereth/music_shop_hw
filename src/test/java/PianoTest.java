import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano(100, 200, "Bossendorf");
    }

    @Test
    public void pianoHasPurchasePrice(){
        assertEquals(100, piano.getPurchasePrice());
    }

    @Test
    public void pianoHasSalePrice() {
        assertEquals(200, piano.getSalePrice());
    }

    @Test
    public void pianoHasBrand() {
        assertEquals("Bossendorf", piano.getBrand());
    }
}
