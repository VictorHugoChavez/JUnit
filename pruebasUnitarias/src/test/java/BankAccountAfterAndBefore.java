import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BankAccountAfterAndBefore {
    static BakAccount bank;

    @BeforeAll
    public static void prepTest() {
        bank = new BakAccount(500, 0);
        System.out.println("Hola iniciando pruebas");
    }

    @Test
    @Order(1)
    public void testWitdrown() {
        bank.withdraw(200);
        assertEquals(300, bank.getBalance());
    }

    @Test
    @Order(2)
    public void testDeposit() {
        bank.deposit(500);
        assertEquals(800, bank.getBalance());
    }

    @AfterAll
    public static void endTest(){
          System.out.println("Finalizando las pruebas");
    }
}
