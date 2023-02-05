import java.util.Scanner;

public class Fibonacci {
    public static boolean fibonacci_num(long num) {

        int x = 0;
        int y = 1;

        while (y < num){
            int z = x+y;
            x = y;
            y = z;
        }
        return y == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número para ver se é Fibonacci ou não:");
        long number = sc.nextLong();
        System.out.println(fibonacci_num(number));
    }

}

