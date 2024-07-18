// src/main/java/com/automovil/model/Automovil.java
package com.example.automovil.model;

import com.example.automovil.enums.Combustible;
import com.example.automovil.enums.TipoAutomovil;
import com.example.automovil.enums.Color;

public class Automovil {
    private String marca;
    private int modelo;
    private double motor;
    private Combustible tipoCombustible;
    private TipoAutomovil tipoAutomovil;
    private int numeroPuertas;
    private int cantidadAsientos;
    private int velocidadMaxima;
    private Color color;
    private int velocidadActual;
    private boolean esAutomatico;
    private int multas;

    public Automovil(String marca, int modelo, double motor, Combustible tipoCombustible,
                     TipoAutomovil tipoAutomovil, int numeroPuertas, int cantidadAsientos,
                     int velocidadMaxima, Color color, boolean esAutomatico) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = 0;
        this.esAutomatico = esAutomatico;
        this.multas = 0;
    }

    // Getters y Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public Combustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(Combustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public boolean isEsAutomatico() {
        return esAutomatico;
    }

    public void setEsAutomatico(boolean esAutomatico) {
        this.esAutomatico = esAutomatico;
    }

    public int getMultas() {
        return multas;
    }

    // Métodos para acelerar, desacelerar y frenar

    public void acelerar(int incremento) {
        if (velocidadActual + incremento > velocidadMaxima) {
            multas++;
            System.out.println("No se puede acelerar más allá de la velocidad máxima permitida. Multa generada.");
        } else {
            velocidadActual += incremento;
        }
    }

    public void desacelerar(int decremento) {
        if (velocidadActual - decremento < 0) {
            System.out.println("No se puede desacelerar a una velocidad negativa.");
        } else {
            velocidadActual -= decremento;
        }
    }

    public void frenar() {
        velocidadActual = 0;
    }

    // Método para calcular el tiempo estimado de llegada
    public double tiempoEstimadoLlegada(double distancia) {
        if (velocidadActual == 0) {
            return Double.POSITIVE_INFINITY; // Retorna infinito si la velocidad actual es 0
        }
        return distancia / velocidadActual;
    }

    // Método para mostrar los valores de los atributos
    public void mostrarValores() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor + "L");
        System.out.println("Tipo de Combustible: " + tipoCombustible);
        System.out.println("Tipo de Automóvil: " + tipoAutomovil);
        System.out.println("Número de Puertas: " + numeroPuertas);
        System.out.println("Cantidad de Asientos: " + cantidadAsientos);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
        System.out.println("Es Automático: " + (esAutomatico ? "Sí" : "No"));
        System.out.println("Multas: " + multas);
    }

    // Método para determinar si tiene multas
    public boolean tieneMultas() {
        return multas > 0;
    }

    // Método para determinar el valor total de multas
    public int valorTotalMultas() {
        return multas * 100; // Suponemos que cada multa tiene un valor de 100
    }
}
