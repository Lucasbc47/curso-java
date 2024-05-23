import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        /*
            2. Faça um programa em JAVA, em um restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de
            refeição. Escreva um algoritmo que leia o peso do prato montado pelo cliente (em quilos) e imprima o
            valor a pagar. Assuma que a balança já desconte o peso do prato.
         */

        double kg_refeicao = 12.00;
        double kg_prato;
        Scanner input = new Scanner(System.in);

        System.out.println("Insira quantos kg tem seu prato:");
        kg_prato = input.nextDouble();

        System.out.println("O valor pra pagar vai ser " + kg_prato * kg_refeicao);
        input.close();
    }
}
