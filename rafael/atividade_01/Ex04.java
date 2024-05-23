import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        /*
        4. Faça um programa em JAVA para calcular quantas ferraduras são necessárias para equipar todos os
        cavalos comprados para um haras.
         */
        int num_cavalos;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos cavalos tem no haras:");
        num_cavalos = scanner.nextInt();

        System.out.println("Serao necessarias" + (num_cavalos*4) + " ferraduras");
        scanner.close();
    }
}
