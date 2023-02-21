// exercicio_25
import java.util.Scanner;

public class exercicio_25 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o número do mês: ");
    int mes = scanner.nextInt();

    int diasNoMes = 0;

    switch (mes) {
      case 1: // Janeiro
      case 3: // Março
      case 5: // Maio
      case 7: // Julho
      case 8: // Agosto
      case 10: // Outubro
      case 12: // Dezembro
        diasNoMes = 31;
        break;
      case 4: // Abril
      case 6: // Junho
      case 9: // Setembro
      case 11: // Novembro
        diasNoMes = 30;
        break;
      case 2: // Fevereiro
        diasNoMes = 28; // Assumimos que o ano não é bissexto
        break;
      default:
        System.out.println("Mês inválido!");
        break;
    }

    if (diasNoMes > 0) {
      System.out.printf("O mês %d tem %d dias.\n", mes, diasNoMes);
    }

    scanner.close();
  }
}
