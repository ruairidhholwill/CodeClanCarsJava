import dealership.person.Customer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer("Kenneth", 15000);
    }

    @Test
    public void aCustomerHasAName(){
        assertEquals("Kenneth", customer.getName());
    }

    @Test
    public void aCustomerAWalletAmount(){
        assertEquals(15000, customer.getWalletAmount());
    }
}
