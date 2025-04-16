import java.util.Scanner;

public class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone;
    }
}

class Aplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Contato[] contatos = new Contato[3];

        System.out.println("Insira os dados dos contatos:");
        for (int i = 0; i < contatos.length; i++) {
            System.out.println("Contato " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();
            contatos[i] = new Contato(nome, telefone);
        }

        System.out.println("\nContatos criados:");
        for (Contato contato : contatos) {
            System.out.println(contato);
        }

        System.out.println("\nModifique os dados dos contatos:");
        for (int i = 0; i < contatos.length; i++) {
            System.out.println("Contato " + (i + 1) + ":");
            System.out.print("Novo Nome: ");
            String novoNome = scanner.nextLine();
            contatos[i].setNome(novoNome);
            System.out.print("Novo Telefone: ");
            String novoTelefone = scanner.nextLine();
            contatos[i].setTelefone(novoTelefone);
        }

        System.out.println("\nContatos atualizados:");
        for (Contato contato : contatos) {
            System.out.println(contato);
        }

        scanner.close();
    }
}
