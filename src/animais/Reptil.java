package animais;

public abstract class Reptil extends Animal {
    public Reptil(String nome) {
        super(nome);
    }

    public abstract void rastejar();
}