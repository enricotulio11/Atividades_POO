package com.geometria;

public class Retangulo extends Forma {
    double largura, altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getArea() {
        return largura * altura;
    }

    public double getArea(double multiplicador) {
        return getArea() * multiplicador;
    }

    public double getPerimetro() {
        return 2 * (largura + altura);
    }

    public double getPerimetro(double multiplicador) {
        return getPerimetro() * multiplicador;
    }
}