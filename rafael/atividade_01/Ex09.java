import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        /*

        9. A Caixa Econômica Federal concederá um crédito especial com juros de 2% aos seus clientes de
        acordo com o saldo médio no último ano. Fazer um programa em JAVA que leia o saldo médio de um
        cliente e calcule o valor do crédito de acordo com a tabela a seguir. Imprimir uma mensagem
        informando o saldo médio e o valor de crédito.

            Saldo Medio     | Percentual
            de 0 a 500      | Nenhum crédito
            de 501 a 1000   | 30% do valor do saldo médio
            de 1000 a 3000  | 40% do valor do saldo médio
            Acima de 3001   | 50% do valor do saldo médio
         
        */

        Scanner input = new Scanner(System.in);
        double saldo_medio;
        double valor_credito = 0;
        
        System.out.println("Insira o saldo médio:");
        saldo_medio = input.nextDouble();
        
        if (saldo_medio <= 500) {
            valor_credito = 0;
        } else if (saldo_medio <= 1000) {
            valor_credito = saldo_medio * 0.3;
        } else if (saldo_medio <= 3000) {
            valor_credito = saldo_medio * 0.4;
        } else {
            valor_credito = saldo_medio * 0.5;
        }
    
        System.out.printf("Saldo medio: R$ %.2f\n", saldo_medio);
        System.out.printf("Valor do credito: R$ %.2f\n", valor_credito);
        input.close();
    }
}
