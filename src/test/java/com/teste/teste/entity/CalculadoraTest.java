package com.teste.teste.entity;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CalculadoraTest {

    @InjectMocks
    private Calculadora calculadora;

    @Mock
    private Calculadora calculadoraMock;

    @BeforeEach
    void setup(){
        MockitoAnnotations.openMocks(this);
        calculadora = new Calculadora();
    }
}
