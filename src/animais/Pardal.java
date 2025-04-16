package animais;

public class Pardal extends Ave {
    public Pardal(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu-piu");
    }

    @Override
    public void voar() {
        System.out.println("Voando rápido");
    }
}