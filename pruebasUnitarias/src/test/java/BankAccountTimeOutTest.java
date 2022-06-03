import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

@ExtendWith(BanckAccountParametrerResolver.class)
public class BankAccountTimeOutTest {
    @Test
    @Timeout(value=1100,unit = TimeUnit.MILLISECONDS)
    public void testDepsitActivite(BakAccount banks){
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        banks.deposit(300);
        assertEquals(300,banks.getBalance());
    }

    @Test
    public void testDepsoitTimeOut(BakAccount bank){
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        bank.deposit(600);
        assertTimeout(Duration.ofMillis(500), ()->{
            Thread.sleep(100);
        });
    }

}
