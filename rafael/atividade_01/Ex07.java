import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        /*
        7. Calculadora: Fazer um programa em JAVA para ler dois números e um dos símbolos das operações: +,
        -, * e /. Exibir o resultado da operação efetuada sobre os números lidos.
         */
        double numero_1, numero_2, resultado = 0;
        String operador;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o numero 1:");
        numero_1 = scanner.nextDouble();

        System.out.println("Insira o numero 2:");
        numero_2 = scanner.nextDouble();

        System.out.print("Insira a operacao matematica [+, -, *, /]: ");
        operador = scanner.next();

        switch (operador){
            case "+":
                resultado = numero_1 + numero_2;
                break;
            case "-":
                resultado =  numero_1 - numero_2;
                break;
            case "/":
                resultado = numero_1 / numero_2;
                break;
            case "*":
                resultado = numero_1 * numero_2;
                break;
        }

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }

}
