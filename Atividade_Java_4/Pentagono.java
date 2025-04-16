class Pentagono extends Forma {
    private double lado;

    public Pentagono(double lado) {
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return (5 * Math.pow(lado, 2)) / (4 * Math.tan(Math.PI / 5));
    }

    @Override
    double calcularPerimetro() {
        return 5 * lado;
    }

    @Override
    double calcularRaio() {
        return 0;
    }
}