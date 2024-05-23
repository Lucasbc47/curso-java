import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        /*
         10. Crie um programa em JAVA que leia a idade de uma pessoa 
            e informe a sua classe eleitoral:
                • não eleitor (abaixo de 16 anos);
                • eleitor obrigatório (entre a faixa de 18 e menor de 65 anos);
                • eleitor facultativo (de 16 até 18 anos e maior de 65 anos, inclusive).
         */
        Scanner scanner = new Scanner(System.in);
        int idade;
        String caso;
        
        System.out.println("Quantos anos voce tem?");
        idade = scanner.nextInt();

        if (idade < 16){
            caso = "nao eleitor";
        }

        else if (idade >= 18 && idade <= 65){
            caso = "eleitor obrigatório";
        }
        else {
            caso = "eleitor facultativo";
        }

        System.out.println(caso);
        scanner.close();

    }
}
