import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class BankAccountTestAssumption {
    @Test
    @DisplayName("Test se activa cuando es activado")
    public void testActive(){
        BakAccount bakAccount=new BakAccount(500,0);
        assumeTrue(bakAccount!=null,"Account is null");
        assertTrue(bakAccount.isActivate());
    }
}
