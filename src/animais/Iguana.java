package animais;

public class Iguana extends Reptil {
    public Iguana(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de iguana");
    }

    @Override
    public void rastejar() {
        System.out.println("Rastejando rápido");
    }
}