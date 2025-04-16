class Quadrado extends Forma {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return lado * lado;
    }

    @Override
    double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    double calcularRaio() {
        return 0;
    }
}