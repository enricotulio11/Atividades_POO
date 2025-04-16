package app;

import animais.*;

public class main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex");
        Gato gato = new Gato("Miau");
        Tartaruga tartaruga = new Tartaruga("Som de tartaruga");
        Iguana iguana = new Iguana("Som de iguana");
        Galinha galinha = new Galinha("Carijó");
        Calopsita calopsita = new Calopsita("Sunny");
        Pardal pardal = new Pardal("Chirpy");
        Arara arara = new Arara("Luna");

        cachorro.emitirSom();
        gato.emitirSom();
        tartaruga.emitirSom();
        iguana.emitirSom();
        galinha.emitirSom();
        calopsita.emitirSom();
        pardal.emitirSom();
        arara.emitirSom();
    }
}