import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        /*
            16. Faça um programa em JAVA que leia 20 números e imprima a soma dos positivos 
            e o total de números negativos.
        */
        Scanner input = new Scanner(System.in);
        int negativos = 0;
        int positivos = 0;
        
        System.out.println("Digite cada numero de (1-20) e pressione enter!");

        for (int i = 1; i <= 20; i++) {
            int numero = input.nextInt();
            if (numero < 0) {
                negativos++;
            } else {
                positivos += numero;
            }
        }
        System.out.println("Soma total dos positivos: " + positivos);
        System.out.println("Numero total de negativos: " + negativos);
        input.close();
    }
}

