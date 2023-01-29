import java.util.Scanner;

public class exercicio_16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Segundos:");

        int segundos = scanner.nextInt();
        int minutos10 = (segundos%3600)/60;

        int horas = segundos/3600;
        int segshow = minutos10%60;

        System.out.print(String.format("%02d:%02d:%02d", horas, minutos10, segshow));
      }
}