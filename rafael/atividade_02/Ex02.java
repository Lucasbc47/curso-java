import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        /*
         * 2. Escreva um programa que solicite ao usuário a entrada de uma senha até que
         * a senha
         * correta "12345" seja digitada. O programa deve exibir uma mensagem de
         * "Acesso Permitido"
         * quando a senha correta for fornecida.
         */
        Scanner sc = new Scanner(System.in);
        String senha_correta = "12345";

        while (true) {
            System.out.println("Tente quebrar a senha....");
            String nova_senha = sc.nextLine();

            if (nova_senha.equals(senha_correta)) {
                System.out.println("Acesso Permitido.");
                break;
            } else {
                System.out.println("Continue tentando......");
            }

        }
        sc.close();
    }
}
