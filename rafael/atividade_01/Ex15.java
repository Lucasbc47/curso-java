import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        /*
            15. Faça um programa em JAVA que leia um valor inteiro 
            (aceitar somente valores entre 1 e 10) e escrever a tabuada de 1 a 10 do valor lido. 
            (Utilizar a estrutura for).
         */
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira um numero [1-10] pra ver a tabuada:");
        int numero = input.nextInt();

        if (numero <= 0 || numero >= 11){
            System.out.println("Insira o valor de 1 a 10!");
            System.exit(0); // sai do programa.
        }

        for(int i=1; i<=10; i++){
            System.out.print(numero + " x " + i + " = " + (numero*i) + "\n");
            
        }       
        input.close();
    }
}
