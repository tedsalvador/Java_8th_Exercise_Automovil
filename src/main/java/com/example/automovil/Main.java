// src/main/java/com/automovil/Main.java
package com.example.automovil;

import com.example.automovil.service.AutomovilService;

public class Main {
    public static void main(String[] args) {
        AutomovilService service = new AutomovilService();
        service.realizarPrueba();
    }
}

