// Autor: Lucas Barboza Costa
// Jogo de Adivinhação de Números com níveis de dificuldade
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static Random rd = new Random();
    /*
     * - O jogo deve permitir ao usuário escolher entre três níveis de dificuldade
     * (fácil, médio, difícil).
     * 
     * - Cada nível de dificuldade terá um intervalo diferente de números a serem
     * adivinhados e um número limitado de tentativas.
     * 
     * - O usuário deve adivinhar o número correto dentro do número
     * permitido de tentativas.
     * 
     * O jogo deve fornecer feedback se o palpite foi muito alto ou muito baixo e,
     * ao final, informar o número correto se:
     * - o jogador não conseguir adivinhar [+] O jogo também deve permitir que
     * o usuário jogue novamente.
     */

    public static String escolhaDiff() {
        int diff;
        while (true) {
            System.out.println("[1]: facil\n[2]: medio\n[3]: dificil\nInsira a dificuldade: ");
            diff = sc.nextInt();
            if (diff >= 1 && diff <= 3) {
                break;
            } else {
                System.out.println("Insira uma dificuldade valida!!");
            }
        }
        String dificuldade = "";

        switch (diff) {
            case 1:
                dificuldade = "facil";
                break;
            case 2:
                dificuldade = "medio";
                break;
            case 3:
                dificuldade = "dificil";
                break;
        }

        return dificuldade;
    }

    public static int tentativas(String dificuldade) {

        int tries = 0;

        if (dificuldade.equals("facil")) {
            tries = 10;
        } else if (dificuldade.equals("medio")) {
            tries = 5;
        } else if (dificuldade.equals("dificil")) {
            tries = 3;
        }
        return tries;
    }

    public static int[] escolheIntervalo(String dificuldade) {
        int[] intervalo = new int[0];

        if (dificuldade.equals("facil")) {
            intervalo = new int[21];
            for (int i = 0; i <= 20; i++) {
                intervalo[i] = i;
            }
        } else if (dificuldade.equals("medio")) {
            intervalo = new int[51];
            for (int i = 0; i <= 50; i++) {
                intervalo[i] = i;
            }
        } else if (dificuldade.equals("dificil")) {
            intervalo = new int[101];
            for (int i = 0; i <= 100; i++) {
                intervalo[i] = i;
            }
        }
        return intervalo;
    }

    public static void realizarJogo() {
        String dificuldade = escolhaDiff();
        int tries = tentativas(dificuldade);
        int[] intervalo = escolheIntervalo(dificuldade);
        int secreto = rd.nextInt(intervalo.length);

        System.out.println("Voce tem " + tries + " tentativas para adivinhar um numero entre " + intervalo[0] + " e "
                + (intervalo.length - 1));

        for (int i = 0; i < tries; i++) {
            System.out.println("Tentativa " + (i + 1) + ": ");
            int palpite = sc.nextInt();

            if (palpite == secreto) {
                System.out.println("Parabens! Voce adivinhou o numero secreto.");
                break;
            } else if (palpite < secreto) {
                System.out.println("Seu palpite foi muito baixo.");
            } else {
                System.out.println("Seu palpite foi muito alto.");
            }

            if (i == tries - 1) {
                System.out.println("Nao foi dessa vez... O numero secreto era " + secreto);
            } else {
                System.out.println("Voce ainda tem " + (tries - (i + 1)) + " tentativas.");
            }
        }

        System.out.println("Deseja jogar novamente? (sim/nao)");
        String resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            realizarJogo();
        } else {
            // se digitar errado ou nao vai cair aqui
            System.out.println("Obrigado por jogar!");
        }
    }

    public static void main(String[] args) {
        /*
         * facil: 0 a 20. [10 tent.]
         * medio: 0 a 50. [5 tent.]
         * dificil: 0 a 100. [3 tent.]
         */
        System.out.println("- Jogo de advinhacao de numeros -");
        realizarJogo();
        sc.close();
    }
}
