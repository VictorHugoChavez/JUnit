import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    @Test
    @DisplayName("Se hace retiro de 500 exitoso")
    public void testWithdrow(){
        BakAccount bank=new BakAccount(500,-1000);
        System.out.println(bank.getBalance());
        bank.withdraw(300);
        System.out.println(bank.getBalance());
        assertEquals(200,bank.getBalance());
    }

    @Test
    @DisplayName("Se realiza un deposito satisfactorio")
    public void depositTest(){
        BakAccount banks= new BakAccount(500,-1000);
        banks.deposit(600);
        assertEquals(1100,banks.getBalance());
    }

    @Test
    @DisplayName("Cuando ambos no soy iguales a 0")
    public void withdrawnTest(){
        BakAccount bankss=new BakAccount(500,-1000);
        bankss.withdraw(800);
        assertNotEquals(0,bankss.getBalance());
    }

    @Test
    @DisplayName("Afrimacion de un bolenano")
    public void testActivate(){
        BakAccount bank = new BakAccount(500,0);
        assertTrue(bank.isActivate());
    }

    @Test
    @DisplayName("comprueba si el valor no es nulo")
    public void testHolderName(){
        BakAccount bank=new BakAccount(500,0);
        bank.setHolderName("Victor");
        assertNotNull(bank.getHolderName());
    }

    @Test
    @DisplayName("Test speed deposit")
    public void tesDepositTineme(){
        BakAccount bakAccount=new BakAccount(500 ,0);
        assertTimeout(Duration.ofNanos(10),()->bakAccount.deposit(200));
        assertEquals(0.0,1/3,"Opps, not the same");
    }
}
