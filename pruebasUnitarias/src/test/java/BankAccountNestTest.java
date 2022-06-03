import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountNestTest {
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

    @Nested
    class WhenBalanceZero{

        @Test
        @DisplayName("Withdawing below minium balance: exception")
        public void testWithdrawnMinimumBalance(){
            BakAccount bakAccount=new BakAccount(0,0);
            assertThrows(RuntimeException.class,()->bakAccount.withdraw(500));
        }

        @Test
        @DisplayName("Withdrawing and getting negative balance")
        public void testWithDorwnMiniumBalanceNegative(){
            BakAccount bakAccount=new BakAccount(0,-1000);
            bakAccount.withdraw(500);
        }
    }
}
