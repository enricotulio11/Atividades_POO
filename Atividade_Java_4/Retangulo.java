class Retangulo extends Forma {
    private double largura, altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return largura * altura;
    }

    @Override
    double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    @Override
    double calcularRaio() {
        return 0;
    }
}