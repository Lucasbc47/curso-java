import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        /*
        6. Faça um programa em JAVA para ler dois números reais e verificar se ambos são maiores que zero.
        Caso positivo, informar “Valores são válidos”. Caso contrário, informar “Valores inválidos”.
        */
        Scanner input = new Scanner(System.in);
        String mensagem;
        int numero_1, numero_2;

        System.out.println("Insira o numero 1:");
        numero_1 = input.nextInt();

        System.out.println("Insira o numero 2:");
        numero_2 = input.nextInt();

        if(numero_1 > 0 && numero_2 > 0){
            mensagem = "Valores sao validos";
        }
        else{
            mensagem = "Valores sao invalidos";
        }

        System.out.println(mensagem);
        input.close();

    }
}
