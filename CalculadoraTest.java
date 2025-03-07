import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
class CalculadoraTest {

 @BeforeAll
 static void setUpBeforeClass() throws Exception {
 System.out.println("---Inicio de las pruebas---");
 }

 @AfterAll
 static void tearDownAfterClass() throws Exception {
 System.out.println("---Final de las pruebas---");
 }
 @Test
 void testSumar() {
 assertEquals(5, Calculadora.sumar(2, 3));
 assertEquals(-1, Calculadora.sumar(-2, 1));
 }

 @Test
 void testRestar() {
 assertEquals(1, Calculadora.restar(3, 2));
 assertEquals(-3, Calculadora.restar(-2, 1));
 }

 @Test
 void testMultiplicar() {
 assertEquals(6, Calculadora.multiplicar(2, 3));
 assertEquals(-2, Calculadora.multiplicar(-2, 1));
 }

 @Test
 void testDividir() {
 assertEquals(2, Calculadora.dividir(6, 3));
 assertThrows(ArithmeticException.class, () -> Calculadora.dividir(1, 0));
 }
 @Test
 void testCalculadora() {
 assertEquals(5, Calculadora.calculadora(2, 3, "sumar"));
 assertEquals(1, Calculadora.calculadora(3, 2, "restar"));
 assertEquals(6, Calculadora.calculadora(2, 3, "multiplicar"));
 assertEquals(2, Calculadora.calculadora(6, 3, "dividir"));
 assertThrows(IllegalArgumentException.class, () -> Calculadora.calculadora(2,
3, "desconocido"));
 }
}
