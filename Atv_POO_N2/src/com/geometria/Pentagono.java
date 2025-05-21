package com.geometria;

public class Pentagono extends Forma {
    double lado;

    public Pentagono(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return (5 * lado * lado) / (4 * Math.tan(Math.PI / 5));
    }

    public double getArea(double multiplicador) {
        return getArea() * multiplicador;
    }

    public double getPerimetro() {
        return 5 * lado;
    }

    public double getPerimetro(double multiplicador) {
        return getPerimetro() * multiplicador;
    }
}