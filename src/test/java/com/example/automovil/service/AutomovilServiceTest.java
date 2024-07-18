// src/test/java/com/automovil/service/AutomovilServiceTest.java
package com.example.automovil.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;

import com.example.automovil.enums.Combustible;
import com.example.automovil.enums.TipoAutomovil;
import com.example.automovil.enums.Color;
import com.example.automovil.model.Automovil;

public class AutomovilServiceTest {
    private Automovil automovil;

    @Before
    public void setUp() {
        automovil = new Automovil("Toyota", 2023, 2.5, Combustible.GASOLINA, TipoAutomovil.SUV, 4, 5, 180, Color.AZUL, true);
    }

    @Test
    public void testAcelerar() {
        automovil.acelerar(50);
        assertThat(automovil.getVelocidadActual(), is(50));

        automovil.acelerar(150);
        assertThat(automovil.getMultas(), is(1));
        assertThat(automovil.getVelocidadActual(), is(50)); // No debe cambiar si se genera una multa
    }

    @Test
    public void testDesacelerar() {
        automovil.setVelocidadActual(100);
        automovil.desacelerar(50);
        assertThat(automovil.getVelocidadActual(), is(50));

        automovil.desacelerar(60);
        assertThat(automovil.getVelocidadActual(), is(50)); // No debe cambiar si se intenta desacelerar más allá de 0
    }

    @Test
    public void testFrenar() {
        automovil.setVelocidadActual(100);
        automovil.frenar();
        assertThat(automovil.getVelocidadActual(), is(0));
    }

    @Test
    public void testMultas() {
        automovil.acelerar(200);
        automovil.acelerar(200);
        assertThat(automovil.getMultas(), is(2));
        assertThat(automovil.valorTotalMultas(), is(200));
    }
}


