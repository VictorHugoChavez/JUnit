import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BankAccontOrder {

    static BakAccount bakAccount=new BakAccount(0,0);

    @Test
    @Order(2)
    public void testWithDrawn(){
        bakAccount.withdraw(300);
        assertEquals(200,bakAccount.getBalance());
    }

    @Test
    @Order(1)
    public void testDeposit(){
        bakAccount.deposit(500);
        assertEquals(500,bakAccount.getBalance());
    }
}
