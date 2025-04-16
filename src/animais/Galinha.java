package animais;

public class Galinha extends Ave {
    public Galinha(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Cocoricó");
    }

    @Override
    public void voar() {
        System.out.println("Galinha não voa muito alto");
    }
}