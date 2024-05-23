import java.util.Scanner; 

public class Ex11 {
    public static void main(String[] args) {
        
        /*
         * 11. Construa um programa em JAVA que determine (imprima) 
         *  se um dado número N inteiro (recebido
            através do teclado) é PAR ou ÍMPAR, pesquisar como utilizar o MOD
         * 
         * -> Se o numero divido por 2 seu resto for diferente 0 é impar
         */

        Scanner sc = new Scanner(System.in);
        int numero;
        
        System.out.println("Insira um numero:");
        numero = sc.nextInt();
        System.out.println("esse numero eh: " + (numero % 2 == 0 ? "par" : "impar"));
        sc.close();
    }
}
