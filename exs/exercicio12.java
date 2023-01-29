import java.util.Arrays;
import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args){

        // Crie um programa que calcule a média de um aluno para
        // a matéria de matemática.

        // Aluno deve informar seu nome, 5 notas da materia
        // Codigo deve mostrar media da nota, maior nota e menor nota.

        Scanner input = new Scanner(System.in);
        System.out.println("Insira seu nome:");
        String name = input.nextLine();

        System.out.println("Insira a primeira nota");
        double g1 = input.nextDouble();

        System.out.println("Insira a segunda nota");
        double g2 = input.nextDouble();

        System.out.println("Insira a terceira nota");
        double g3 = input.nextDouble();

        System.out.println("Insira a quarta nota");
        double g4 = input.nextDouble();

        System.out.println("Insira a quinta nota");
        double g5 = input.nextDouble();

        double[] grades = {g1, g2, g3, g4, g5};
        double media = (g1 + g2 + g3 + g4 + g5)/5;

        System.out.println("Nome do aluno: " + name);
        System.out.println("Media das notas: " + media);

        Arrays.sort(grades);


        System.out.println("Maior nota: " + grades[4]);
        System.out.println("Menor nota: " + grades[0]);

    }
}



