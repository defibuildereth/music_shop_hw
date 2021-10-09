import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Pleck pleck;
    Shop shop;

    @Before
    public void before() {
        pleck = new Pleck(1, 2, "Dunno");
        shop = new Shop("Donald's Shop");
//        shop.addStock(pleck)
    }

    @Test
    public void cantSellOutOfStock() {
        pleck.sell(shop);
        assertEquals(0, shop.getTill());
    }
}
