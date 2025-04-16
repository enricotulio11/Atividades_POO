import java.util.ArrayList;

public class TimeDeFutebol {
    private String nome;
    private ArrayList<Jogador> jogadores;
    private ArrayList<Premiacao> premiacoes;

    public TimeDeFutebol(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
        this.premiacoes = new ArrayList<>();
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void adicionarPremiacao(Premiacao premiacao) {
        premiacoes.add(premiacao);
    }

    public void listarJogadores() {
        System.out.println("Jogadores do " + nome + ":");
        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }
    }

    public void listarPremiacoes() {
        System.out.println("Premiações do " + nome + ":");
        for (Premiacao premiacao : premiacoes) {
            System.out.println(premiacao);
        }
    }
}
