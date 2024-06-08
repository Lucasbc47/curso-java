import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        /*
         * 1. Escreva um programa que leia números inteiros positivos fornecidos pelo
         * usuário até que
         * um número negativo seja digitado. O programa deve calcular e imprimir a soma
         * de todos os
         * números positivos digitados.
         */
        Scanner sc = new Scanner(System.in);
        int numeros = 0;

        while (true) {
            System.out.println("Insira o numero inteiro, se for negativo o programa para...\n>>: ");
            int numero = sc.nextInt();

            if (numero < 0) {
                break;
            } else {
                numeros += numero;
            }
        }

        System.out.println("Somatoria: " + numeros);
        sc.close();
    }
}
