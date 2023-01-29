import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Altura da parede:");
        double altura_parede = scanner.nextDouble();

        System.out.println("Largura da parede:");
        double largura_parede = scanner.nextDouble();

        System.out.println("Altura do azulejo:");
        double altura_azulejo = scanner.nextDouble();

        System.out.println("Largura do azulejo: ");
        double largura_azulejo = scanner.nextDouble();

        double cobrir = (altura_parede * largura_parede) / (altura_azulejo * largura_azulejo);
        System.out.println("Serão necessarios: " + cobrir + " azulejos");

    }
}
