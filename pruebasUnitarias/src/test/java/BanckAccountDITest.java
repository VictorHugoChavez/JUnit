import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(BanckAccountParametrerResolver.class)
public class BanckAccountDITest {
    @RepeatedTest(5)
    @DisplayName("Se realiza un deposito satisfactorio")
    public void depositTest(BakAccount banks){
        banks.deposit(600);
        assertEquals(600,banks.getBalance());
    }
    @RepeatedTest(5)
    @DisplayName("Se realiza un deposito satisfactorio")
    public void depositTestInfo(BakAccount banks, RepetitionInfo repetitionInfo){
        banks.deposit(600);
        assertEquals(600,banks.getBalance());
        System.out.println("Prueba: " +repetitionInfo.getCurrentRepetition());
    }
}
