package com.teste.teste.entity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class CalculadoraTest {

    @InjectMocks
    private Calculadora calculadora;

    @BeforeEach
    void setup(){
        calculadora = new Calculadora();
    }

    @Test
    void testSoma() {
        int resultado = calculadora.soma(2,3);
        assertEquals(5, resultado);
    }

    @Test
    void testSubtracao() {
        int resultado = calculadora.subtrair(3,2);
        assertEquals(1, resultado);
    }

    @Test
    void testMultiplicacao() {
        int resultado = calculadora.multiplicar(2,3);
        assertEquals(6, resultado);
    }

    @Test
    void testDivisao() {
        double resultado = calculadora.dividir(6,2);
        assertEquals(3, resultado);
    }

    @Test
    void testDivisaoPorZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(2,0);
        });
    }

    @Test
    void testPotencia() {
        double resultado = calculadora.potencia(3,3);
        assertEquals(27, resultado);
    }

    @Test
    void testRaizQuadrada() {
        double resultado = calculadora.raizQuadrada(36);
        assertEquals(6, resultado);
    }

    @Test
    void testRaizQuadradaNegativo() {
        assertThrows(ArithmeticException.class, () -> {
            calculadora.raizQuadrada(-36);
        });
    }

    @Test
    void testFatorial() {
        double resultado = calculadora.fatorial(5);
        assertEquals(120, resultado);
    }

    @Test
    void testFatorialNegativo() {
        assertThrows(ArithmeticException.class, () -> {
            calculadora.fatorial(-5);
        });
    }

    @Test
    void testMedia() {
        int valores[] = {2,4,6};
        double resultado = calculadora.media(valores);
        assertEquals(4, resultado);
    }

    @Test
    void testMediaVazia() {
        assertThrows(ArithmeticException.class, () -> {
            int valores[] = {};
            double resultado = calculadora.media(valores);
        });
    }

    @Test
    void testPrimo() {
        boolean resultado = calculadora.primo(11);
        assertEquals(true, resultado);
    }

    @Test
    void testNaoPrimo() {
        assertThrows(ArithmeticException.class, () -> {
            boolean resultado = calculadora.primo(10);
        });
    }

    @Test
    void testSomaDigitos() {
        int resultado = calculadora.somaDigitos(2025);
        assertEquals(9, resultado);
    }

}
