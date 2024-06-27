import java.util.Scanner;
/*
2- Criar um programa em Java que calcula a concentração molar de uma solução.

O usuário entra com a massa do soluto em gramas.
O usuário entra com a massa molar do soluto.
O usuário entra com o volume da solução em litros.
O programa calcula e exibe a concentração molar da solução.
*/

public class Exercicio02 {

    public static double calcularConMolar(double massaSoluta, double massaMolar, double volumeLitros) {
        double concentracaoMolar = massaSoluta / (massaMolar * volumeLitros);
        return concentracaoMolar;
    }

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("-- Calcular Concentração Molar --");

        System.out.print("Massa do Soluto em (g): ");
        double massa_soluta = sc.nextDouble();

        System.out.print("Massa molar em (g/mol): ");
        double massa_molar = sc.nextDouble();

        System.out.print("Volume da solução em (L): ");
        double volume_litro = sc.nextDouble();

        double con_molar = calcularConMolar(massa_soluta, massa_molar, volume_litro);
        System.out.printf("Concentração Molar da solução: %.4f mol/L\n", con_molar);

        sc.close();
    }
}
