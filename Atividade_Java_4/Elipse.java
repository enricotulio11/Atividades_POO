class Elipse extends Forma {
    private double raioMaior, raioMenor;

    public Elipse(double raioMaior, double raioMenor) {
        this.raioMaior = raioMaior;
        this.raioMenor = raioMenor;
    }

    @Override
    double calcularArea() {
        return Math.PI * raioMaior * raioMenor;
    }

    @Override
    double calcularPerimetro() {
        return Math.PI * (raioMaior + raioMenor);
    }

    @Override
    double calcularRaio() {
        return (raioMaior + raioMenor) / 2;
    }
}