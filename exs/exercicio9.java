import java.util.Scanner;

public class exercicio9 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double[] alturas = new double[10];
    String[] sexos = new String[10];

    for (int i = 0; i < 10; i++) {
      System.out.printf("Digite a altura (em metros) da %dª pessoa: ", i+1);
      alturas[i] = scanner.nextDouble();
      scanner.nextLine(); 
      System.out.printf("Digite o sexo (M ou F) da %dª pessoa: ", i+1);
      sexos[i] = scanner.nextLine().toUpperCase();
    }

    double maiorAltura = alturas[0];
    double menorAltura = alturas[0];
    for (int i = 1; i < 10; i++) {
      if (alturas[i] > maiorAltura) {
        maiorAltura = alturas[i];
      }
      if (alturas[i] < menorAltura) {
        menorAltura = alturas[i];
      }
    }
    System.out.printf("Maior altura do grupo: %.2f metros\n", maiorAltura);
    System.out.printf("Menor altura do grupo: %.2f metros\n", menorAltura);

    double somaAlturasHomens = 0.0;
    int numHomens = 0;
    for (int i = 0; i < 10; i++) {
      if (sexos[i].equals("M")) {
        somaAlturasHomens += alturas[i];
        numHomens++;
      }
    }
    double mediaAlturasHomens = somaAlturasHomens / numHomens;
    System.out.printf("Média de altura dos homens: %.2f metros\n", mediaAlturasHomens);

    int numMulheres = 0;
    for (int i = 0; i < 10; i++) {
      if (sexos[i].equals("F")) {
        numMulheres++;
      }
    }
    System.out.printf("Número de mulheres: %d\n", numMulheres);

    scanner.close();
  }
}
