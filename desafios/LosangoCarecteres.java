import java.util.Scanner;

public class LosangoCarecteres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Numero:");

        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.printf("%c", (char)(j+64));
            }
            for(int j=i-1;j>=1;j--)
            {
                System.out.printf("%c", (char)(j+64));
            }

            System.out.println();
        }

        for (int i=1; i > 0; i++){

            for(int j=1; j <= n; n++){
                System.out.print(" ");
            }

            for(int j = 1; n <=i; i++){
                System.out.printf("%c", (char)(j+64));

            }

        }




    }
}
