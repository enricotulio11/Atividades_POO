package animais;

public class Cachorro extends Mamifero {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au-au");  // Som alterado
    }

    @Override
    public void amamentar() {
        System.out.println("Amamentando filhotes");
    }
}