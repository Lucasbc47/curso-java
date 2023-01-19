import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double aumento = 1.5, salario = 1000, ano = 2022;

        do {
            aumento = aumento * 2;
            salario = salario + (salario + aumento / 100);
            ano++;
        }

        while (ano <= 2022); {
            System.out.println(salario);
        }

    }
}
