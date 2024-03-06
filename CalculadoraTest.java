import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testSomar() {
        Calculadora calc = new Calculadora();

        assertEquals(5, calc.somar(2, 3));
        assertEquals(-1, calc.somar(-2, 1));
        assertEquals(0, calc.somar(0, 0));
    }

    @Test
    public void testSubtrair() {
        Calculadora calc = new Calculadora();

        assertEquals(1, calc.subtrair(3, 2));
        assertEquals(-3, calc.subtrair(-2, 1));
        assertEquals(0, calc.subtrair(0, 0));
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();

        assertEquals(6, calc.multiplicar(2, 3));
        assertEquals(-2, calc.multiplicar(-2, 1));
        assertEquals(0, calc.multiplicar(0, 0));
        assertEquals(0, calc.multiplicar(1, 0));
    }

    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();

        assertEquals(1.5, calc.dividir(3, 2), 0.001);
        assertEquals(-1, calc.dividir(-2, 1));
        assertEquals(0, calc.dividir(0, 1));

        assertThrows(IllegalArgumentException.class, () -> calc.dividir(1, 0));
    }
}