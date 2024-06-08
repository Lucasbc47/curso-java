import java.util.Scanner;

public class Ex04 {
    /*
     * 4. Crie uma classe Pessoa com atributos nome e idade. Adicione um método que
     * verifica se a
     * pessoa é maior de idade e um método para exibir uma mensagem de boas-vindas
     * personalizada.
     */
    public static class Pessoa {
        private String nome;
        private int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public boolean ehMaior() {
            return this.idade >= 18;
        }

        public void boasVindas() {
            if (ehMaior()) {
                System.out.println("Bem-vindo, " + nome + " ;) [+18]");
            } else {
                System.out.println("Bem-vindo, " + nome + " =^) [-18]");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Prazer, qual seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Sua idade por favor...");
        int idade = scanner.nextInt();

        Pessoa pessoa = new Pessoa(nome, idade);
        pessoa.boasVindas();
        scanner.close();
    }
}
