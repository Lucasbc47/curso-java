import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Ex08 {
    public static void main(String[] args) {
        /*

        8. Construa um programa em JAVA para determinar se o indivíduo está com um peso favorável. Essa
        situação é determinada através do IMC (Índice de Massa Corpórea), que é definida como sendo a
        relação entre o peso (PESO) e o quadrado da Altura (ALTURA) do indivíduo. 
        Ou seja,
        
                                    IMC = PESO/ALTURA^2
         */
        Scanner input = new Scanner(System.in);
        double imc, peso, altura;

        String formato = "##.##";
        DecimalFormat decimalFormat = new DecimalFormat(formato);
        
        String resultado = "nenhum";

        System.out.println("Insira seu peso (kg): ");
        peso = input.nextDouble();

        System.out.println("Insira sua altura m:");
        altura = input.nextDouble();

        imc = (peso / (Math.pow(altura, 2)));

        if (imc <= 19.9){
            resultado = "abaixo do peso";
        }
        else if (imc >= 20.0 && imc <= 24.9){
            resultado = "peso ideal";
        }
        else if (imc >= 25.0 && imc <= 29.9){
            resultado = "levemente acima do peso";
        }
        else if (imc >= 30.0 && imc <= 34.9){
            resultado = "obesidade grau I";
        }
        else if (imc >= 35.0 && imc <= 39.9){
            resultado = "obesidade grau II (severa)";
        }
        else if (imc >= 40.0){
            resultado = "obesidade grau III (mórbida)";
        }

        String imc_formatado = decimalFormat.format(imc);
        
        System.out.println("De acordo com IMC: " + imc_formatado + " | classificado como: " + resultado);
        input.close();
    }

}
