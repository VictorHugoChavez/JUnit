import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;

import java.time.DayOfWeek;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(BanckAccountParametrerResolver.class)
public class BankAccountParametizedTest {
    @ParameterizedTest
    @ValueSource(ints = {100,200,300,900,800})
    @DisplayName("Test successfly")
    public void testDepositSource(int x,BakAccount bakAccount){
        bakAccount.deposit(x);
        assertEquals(x,bakAccount.getBalance());
    }

    @ParameterizedTest
    @EnumSource(value = DayOfWeek.class, names = {"TUESDAY","THURSDAY"})
    public void testDayofWeekS(DayOfWeek day){
        assertTrue(day.toString().startsWith("T"));
    }

    @ParameterizedTest
    //@CsvSource({"100, Mary","300, Julia", "900, Petra"})
    @CsvFileSource(resources = "Archivo.csv")
    public void depositAndNameTest(double amount, String name, BakAccount Bank){
        Bank.deposit(amount);
        Bank.setHolderName(name);
        assertEquals(amount,Bank.getBalance());
        assertEquals(name,Bank.getHolderName());
    }
}
