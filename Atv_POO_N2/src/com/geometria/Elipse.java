package com.geometria;

public class Elipse extends Forma {
    double a, b;

    public Elipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getArea() {
        return Math.PI * a * b;
    }

    public double getArea(double multiplicador) {
        return getArea() * multiplicador;
    }

    public double getPerimetro() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    public double getPerimetro(double multiplicador) {
        return getPerimetro() * multiplicador;
    }

    public double getMaiorDiametro() {
        return 2 * a;
    }

    public double getMenorDiametro() {
        return 2 * b;
    }

    public double getMaiorDiametro(double multiplicador) {
        return getMaiorDiametro() * multiplicador;
    }

    public double getMenorDiametro(double multiplicador) {
        return getMenorDiametro() * multiplicador;
    }
}