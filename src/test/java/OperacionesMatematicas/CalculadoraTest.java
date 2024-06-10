package OperacionesMatematicas;
import static org.junit.jupiter.api.Assertions.*;
import  org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CalculadoraTest {
    Calculadora calculadora;
    @BeforeEach
    void alIniciar() {
        calculadora = new Calculadora();

    }

    @AfterEach
    void alFinalizar() {
        calculadora = null;
    }

    @BeforeAll
    static void alIniciarTodasLasPruebas(){
        System.out.println("Iniciar todas las pruebas");
    }

    @AfterAll
    static void alFinalizarTodasLasPruebas(){
        System.out.println("finalizar todas las pruebas");

    }

    @Test
    @Order(1)
    void sumar() {
        int num1=5;
        int num2=7;
        int resultadoEsperado = 12;
        int resultado = calculadora.sumar(num1, num2);
        assertEquals(resultadoEsperado,resultado);
    }

    @Test
    @Order(2)
    void restar() {
        int num1=10;
        int num2=6;
        int resultadoEsperado = 4;
        int resultado = calculadora.restar(num1, num2);
        assertTrue(resultadoEsperado==resultado);
    }

    @Test
    @Order(2)
    void multiplicar() {
        int num1=10;
        int num2=6;
        int resultadoEsperado = 60;
        int resultado = calculadora.multiplicar(num1, num2);
        if(resultadoEsperado!=resultado){
            fail("fallo la multiplicacion");
        }
    }

    @Test
    @Order(2)
    void dividir() {
        int num1=10;
        int num2=0;
        int resultadoEsperado = 0;
        if(num2 != 0){
            int resultado = calculadora.dividir(num1, num2);
            if(resultadoEsperado!=resultado){
                fail("fallo la division");
            }
        }
       assertThrows(
               ArithmeticException.class,
               () -> {
                   int result = calculadora.dividir(num1,num2);
               }
       );
    }
}