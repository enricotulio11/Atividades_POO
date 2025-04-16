public class Main {
    public static void main(String[] args) {
        TimeDeFutebol time = new TimeDeFutebol("Real Madrid");
        TimeDeFutebol time2 = new TimeDeFutebol("Barcelona");

        Jogador jogador1 = new Jogador("Vini Jr", 24, "Atacante");
        Jogador jogador2 = new Jogador("Bellingham", 21, "Meia");
        Jogador jogador3 = new Jogador("Raphinha", 28, "Atacante");
        Jogador jogador4 = new Jogador("Lewandowski", 36, "Atacante");
        time.adicionarJogador(jogador1);
        time.adicionarJogador(jogador2);
        time2.adicionarJogador(jogador3);
        time2.adicionarJogador(jogador4);

        Premiacao premiacao1 = new Premiacao("Champions League", 2024);
        Premiacao premiacao2 = new Premiacao("La liga", 2022);
        Premiacao premiacao3 = new Premiacao("Champions League", 2025);
        Premiacao premiacao4 = new Premiacao("La liga", 2023);
        time.adicionarPremiacao(premiacao1);
        time.adicionarPremiacao(premiacao2);
        time2.adicionarPremiacao(premiacao3);
        time2.adicionarPremiacao(premiacao4);

        time.listarJogadores();
        time.listarPremiacoes();
        System.out.println();

        time2.listarJogadores();
        time2.listarPremiacoes();
    }
}