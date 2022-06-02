import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class metthodDivdideTest {
    private methodDivide methodDivide;
    @BeforeEach
    public void initTest(){
        methodDivide = new methodDivide();
    }

    @Test
    public void divide(){
       assertEquals(10,methodDivide.divide(100,10));
    }
    @Test
    public void testOperaciones(){
       assertEquals(6,methodDivide.operacionMatematica(20,30,100));
    }
    @Test
    public void testDivideByZero(){
        assertThrows(ArithmeticException.class,()-> methodDivide.divide(10,0));
    }
}
