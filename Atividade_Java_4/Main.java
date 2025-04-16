public class Main {
    public static void main(String[] args) {
        Forma circulo = new Circulo(5);
        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());
        System.out.println("Raio do círculo: " + circulo.calcularRaio());

        Forma elipse = new Elipse(6, 4);
        System.out.println("Área da elipse: " + elipse.calcularArea());
        System.out.println("Perímetro da elipse: " + elipse.calcularPerimetro());
        System.out.println("Raio médio da elipse: " + elipse.calcularRaio());

        Forma quadrado = new Quadrado(4);
        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());
    }
}