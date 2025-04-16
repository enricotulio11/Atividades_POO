package animais;

public class Gato extends Mamifero {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");  // Som pode ser mantido ou alterado
    }

    @Override
    public void amamentar() {
        System.out.println("Amamentando filhotes");
    }
}