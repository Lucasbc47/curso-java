import java.util.Scanner;

public class exercicio_24 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o primeiro float:");
        float first_num = input.nextFloat();

        System.out.println("Insira o segundo float:");
        float second_num = input.nextFloat();

        if (first_num % 3.f == second_num % 3.f){
            System.out.println("Ambos tem pontos flutuantes iguais");
        }
        else{
            System.out.println("Ambos tem pontos flutuantes diferentes");
        }

    }
}

