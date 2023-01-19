public class Main {
    public static void main(String[] args) {

        double aumento = 1.5, salario = 1000, ano = 2022;

        do {
            aumento = aumento * 2; // 1.5% * 2
            salario = salario + (salario + aumento / 100); // 1000 + 1.5%
            ano++; // Incrementa +1
        }

        while (ano <= 2022); {
            // Enquanto for menor ou igual a 2022:
            System.out.println(salario);
        }

    }
}
