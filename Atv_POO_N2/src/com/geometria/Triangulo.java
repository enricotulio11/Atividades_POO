package com.geometria;

public class Triangulo extends Forma {
    double base, altura, lado1, lado2, lado3;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getArea() {
        return (base * altura) / 2;
    }

    public double getArea(double multiplicador) {
        return getArea() * multiplicador;
    }

    public double getPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public double getPerimetro(double multiplicador) {
        return getPerimetro() * multiplicador;
    }
}