import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        /*
        3. Faça um programa em JAVA, A imobiliária ORACLE vende apenas terrenos retangulares. Faça um
        algoritmo para ler as dimensões de um terreno e depois exibir a área do terreno.
        */

        // a = b . h | a: area | b: largura | h: altura
        Scanner input = new Scanner(System.in);

        double a, b, h;

        System.out.println("Insira a largura:");
        b = input.nextDouble();

        System.out.println("Insira altura:");
        h = input.nextDouble();

        a = b * h;
        System.out.println("Area final: " + a);
        input.close();
    }
}
