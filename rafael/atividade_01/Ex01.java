import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        /*
        1. Faça um programa em JAVA, o motorista deseja colocar no seu tanque X reais de gasolina. Escreva
        um algoritmo para ler o preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele
        conseguiu colocar no tanque.
         */

        Scanner input = new Scanner(System.in);
        double prc_comb, colocar_r, valor_final;

        System.out.println("Quanto esta o preco do litro da gasolina?");
        prc_comb = input.nextDouble(); // ex: 5,90

        System.out.println("Quantos $ voce quer colocar?");
        colocar_r = input.nextDouble();

        valor_final = colocar_r / prc_comb;
        System.out.println("Voce vai conseguir colocar: " + valor_final + "l");

        input.close();
    }
}
