import java.util.Scanner;

public class Ex06 {
    /*
     * 6. Escreva um método que verifique se um número dado é primo. O método deve
     * utilizar uma
     * estrutura de repetição para fazer a verificação.
     */

    public static boolean ehPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        // Eu confesso que nao entendi 100% de usar raiz quadrada pra isso, mas faz o
        // trabalho já..
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        /*
         * O que eh um numero primo? Google responde....
         * Um número primo é um número natural maior que 1 que não pode ser formado pela
         * multiplicação de outros dois naturais menores. Um número natural maior que 1
         * que não é primo é chamado de número composto. Por exemplo, 5 é primo porque
         * as únicas maneiras de escrevê-lo como um produto, 1 × 5 ou 5 × 1, envolvem o
         * próprio 5.
         * 
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é primo:");
        int numero = sc.nextInt();

        boolean resultado = ehPrimo(numero);

        if (resultado) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }

        sc.close();
    }
}
