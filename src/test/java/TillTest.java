import dealership.equipment.Till;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TillTest {

    Till till;

    @Before
    public void before(){
        till = new Till(10000);
    }

    @Test
    public void hasAmountOfMoney(){
        assertEquals(10000, till.getMoney());
    }

    @Test
    public void canSetAmountOfMoney(){
        till.setMoney(20000);
        assertEquals(20000, till.getMoney());
    }
}
