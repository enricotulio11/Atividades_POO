package com.geometria;

public class Circunferencia extends Forma {
    double raio;

    public Circunferencia(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return Math.PI * raio * raio;
    }

    public double getArea(double multiplicador) {
        return getArea() * multiplicador;
    }

    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double getPerimetro(double multiplicador) {
        return getPerimetro() * multiplicador;
    }

    public double getDiametro() {
        return 2 * raio;
    }

    public double getDiametro(double multiplicador) {
        return getDiametro() * multiplicador;
    }
}