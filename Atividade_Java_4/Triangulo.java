class Triangulo extends Forma {
    private double base, altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    double calcularPerimetro() {
        return 3 * base;
    }

    @Override
    double calcularRaio() {
        return 0;
    }
}