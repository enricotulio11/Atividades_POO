package animais;

public class Calopsita extends Ave {
    public Calopsita(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Trinado");  // Som alterado
    }

    @Override
    public void voar() {
        System.out.println("Voando suavemente");
    }
}