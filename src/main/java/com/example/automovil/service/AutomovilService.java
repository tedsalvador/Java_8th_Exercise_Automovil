// src/main/java/com/automovil/service/AutomovilService.java
package com.example.automovil.service;

import com.example.automovil.enums.Color;
import com.example.automovil.enums.Combustible;
import com.example.automovil.enums.TipoAutomovil;
import com.example.automovil.model.Automovil;

public class AutomovilService {
    public void realizarPrueba() {
        Automovil automovil = new Automovil("Toyota", 2023, 2.5, Combustible.GASOLINA, TipoAutomovil.SUV, 4, 5, 180, Color.AZUL, true);
        automovil.setVelocidadActual(100);
        automovil.mostrarValores();
        
        automovil.acelerar(20);
        System.out.println("Velocidad Actual: " + automovil.getVelocidadActual() + " km/h");
        
        automovil.desacelerar(50);
        System.out.println("Velocidad Actual: " + automovil.getVelocidadActual() + " km/h");
        
        automovil.frenar();
        System.out.println("Velocidad Actual: " + automovil.getVelocidadActual() + " km/h");
        
        System.out.println("¿Tiene multas? " + automovil.tieneMultas());
        System.out.println("Valor total de multas: " + automovil.valorTotalMultas());
    }
}


