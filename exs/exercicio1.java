// Peça 3 números
// Some os 3 números
// Imprima a soma e o maior número

import java.util.Scanner;
import java.util.Arrays;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o primeiro numero:");
        int num1 = input.nextInt();

        System.out.println("Insira o segundo numero:");
        int num2 = input.nextInt();

        System.out.println("Insira o terceiro numero:");
        int num3 = input.nextInt();

        int soma = num1 + num2 + num3;
        System.out.println("Soma: " + soma);

        int arr[] = {num1, num2, num3};
        Arrays.sort(arr);
        System.out.println("Maior numero: " + arr[2]);
    }
}
