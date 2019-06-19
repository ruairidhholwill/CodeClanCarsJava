import dealership.person.Dealer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DealerTest {

    Dealer dealer;

    @Before
    public void before(){
        dealer = new Dealer("Kenny");
    }

    @Test
    public void aDealerHasAName(){
        assertEquals("Kenny", dealer.getName());
    }

}