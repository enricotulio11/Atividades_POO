package com.geometria;

public class Geometria {

    public static void mostrarRaiosEDiametros(Forma[] formas) {
        for (Forma f : formas) {
            if (f instanceof Circunferencia) {
                Circunferencia c = (Circunferencia) f;
                System.out.println("Circunferência: Raio = " + c.raio +
                        ", Diâmetro = " + c.getDiametro());
            } else if (f instanceof Elipse) {
                Elipse e = (Elipse) f;
                System.out.println("Elipse: Semi-eixo maior = " + e.a +
                        ", Semi-eixo menor = " + e.b +
                        ", Maior Diâmetro = " + e.getMaiorDiametro() +
                        ", Menor Diâmetro = " + e.getMenorDiametro());
            }
        }
    }

    public static void main(String[] args) {
        Forma[] formas = new Forma[5];
        formas[0] = new Triangulo(3, 4, 3, 4, 5);
        formas[1] = new Retangulo(5, 7);
        formas[2] = new Circunferencia(5);
        formas[3] = new Pentagono(6);
        formas[4] = new Elipse(4, 3);

        for (Forma forma : formas) {
            System.out.println("Forma: " + forma.getClass().getSimpleName());
            System.out.println("Área = " + forma.getArea());
            System.out.println("Área (sobrecarga, multiplicador 1.5) = " + forma.getArea(1.5));
            System.out.println("Perímetro = " + forma.getPerimetro());
            System.out.println("Perímetro (sobrecarga, multiplicador 2.0) = " + forma.getPerimetro(2.0));
            System.out.println("-----------------------------------");
        }

        System.out.println("----- Exibindo raios e diâmetros (polimorfismo) -----");
        mostrarRaiosEDiametros(formas);
    }
}