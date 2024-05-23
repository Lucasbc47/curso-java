import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        /*
        13. Faça um programa em JAVA, que leia três lados de um triângulo, 
        verifique e escreva que tipo de triângulo eles formam 
        (considere triângulo equilátero com três lados iguais, triângulo isóscele com dois
        lados iguais e triângulo escaleno com todos os lados diferentes).
        */
        int a, b, c; // cada lado eh uma letra
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira valor do primeiro lado:");
        a = sc.nextInt();
        
        System.out.println("Insira valor do segundo lado:");
        b = sc.nextInt();
        
        System.out.println("Insira valor do terceiro lado:");
        c = sc.nextInt();

        /*  
        - Na matemática a gente considera a seguinte propriedade pra
        verificar se eh triangulo valido ou nao
            - a + b > c
            - a + c > b
            - b + c > a
        */

        // faz toda verificao acima por em uma linha. - se chama operador ternario!
        boolean triangulo_ou_nao = (a + b > c && a + c > b && b + c > a) ? true: false;
        
        if (triangulo_ou_nao){
            if (a == b && b == c) {
                System.out.println("O triangulo é equilátero.");
            } else if (a == b || b == c || a == c) {
                System.out.println("O triangulo é isósceles.");
            } else {
                System.out.println("O triangulo é escaleno.");
            }
        }

        else{
            System.out.println("Nao se trata de um triangulo!");
        }
        // faca os testes: a-3 b-3 c-3 etc ..  5 5 8 | 3 4 5
        
        sc.close();
    }
}
