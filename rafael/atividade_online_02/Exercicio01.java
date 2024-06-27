import java.util.Scanner;
import java.util.ArrayList;

/*
1 - Criar um programa em Java que calcula:
    resistência total de um circuito com resistores em série e em paralelo.
    [Ω]
    - O usuário escolhe o tipo de circuito (série ou paralelo).
    - O usuário entra com o número de resistores.
    - O usuário insere os valores das resistências.
    - O programa calcula e exibe a resistência total.

    Honestamente não lembrava de como realizava
    esse calculo....

    Resistores em série:
    Rt = R1Ω + R2 + R3 + ... 

    Resistores em paralelo: 
    1/Rt = 1/R1 + 1/R2 + 1/R3 ..
        -> Inverta o resultado da soma para encontrar a resistência total.
        1/Rt
*/

public class Exercicio01 {

    public static double calculaResistencia(String tipo, int resistores, ArrayList<Double> valores_resistencia) {

        /*
         * Funcao recebe:
         * String tipo : pode ser paralelo ou serie
         * int resistores : quantia de resisotres, mesma quantia de valores de
         * resistencia
         * ArrayList<Double> valores_resistencia : array dinamica que vem com valores
         * Double
         * Retorna:
         * double resistencia_total;
         */

        double resistencia_total = 0;

        if (tipo.equals("serie")) {
            for (Double resDouble : valores_resistencia) {
                resistencia_total += resDouble;
            }
        }

        else if (tipo.equals("paralelo")) {
            for (Double resDouble : valores_resistencia) {
                if (resDouble != 0) {
                    resistencia_total += 1 / resDouble;
                } else {
                    System.out.println("Resistor com valor zero encontrado. Resistencia invalida...");
                }
            }

            if (resistencia_total != 0) {
                resistencia_total = 1 / resistencia_total;
            } else {
                System.out.println("Resistencia inválida.");
                System.exit(0);
            }
        }
        return resistencia_total;
    }

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("-- Calcular Resistencias --");
        System.out.println("Digite [1] para: Resistor em PARALELO!");
        System.out.println("Digite [2] para: Resistor em SERIE!");
        System.out.println(" -- Sua opcao -- :");

        int opt = sc.nextInt();
        String meio = (opt == 1) ? "paralelo" : (opt == 2) ? "serie" : "opcao invalida";

        System.out.println("Insira quantos resistores:");
        int resis = sc.nextInt();

        ArrayList<Double> valores_resistores = new ArrayList<>();

        for (int i = 0; i < resis; i++) {
            System.out.println("Insira valor pra r" + i + ": ");
            valores_resistores.add(sc.nextDouble());
        }

        double rt = calculaResistencia(meio, resis, valores_resistores);
        System.out.printf("Resistência Total: %.2f ohms - tipo: %s\n", rt, meio);
        sc.close();
    }
}
