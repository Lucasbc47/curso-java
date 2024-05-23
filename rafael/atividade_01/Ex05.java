import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        /*
        5. Faça um programa em JAVA, que calcule e mostre a área de um triângulo (área é igual a (base x altura)
        dividido por 2).
         */

        // a = b . h | a: area | b: largura | h: altura
        Scanner input = new Scanner(System.in);

        double a, b, h;

        System.out.println("Insira a largura:");
        b = input.nextDouble();

        System.out.println("Insira altura:");
        h = input.nextDouble();

        a = (b * h)/2;
        System.out.println("Area final: " + a);
        input.close();
    }
}
