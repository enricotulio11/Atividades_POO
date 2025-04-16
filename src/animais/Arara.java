package animais;

public class Arara extends Ave {
    public Arara(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Grito alegre");  // Som alterado
    }

    @Override
    public void voar() {
        System.out.println("Voando majestuosamente");
    }
}