package animais;

public class Tartaruga extends Reptil {
    public Tartaruga(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de tartaruga");
    }

    @Override
    public void rastejar() {
        System.out.println("Rastejando devagar");
    }
}