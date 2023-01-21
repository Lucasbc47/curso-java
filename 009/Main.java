public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;


        while (x < 5) {


            // candidato: 1 out: 5
            // y = x - y;
            // 00 11 21 32 42

            // candidato: 2 out: 7
            // y = y + x;
            // 00 11 23 36 410

            // candidato: 3 out: 8
            // y = y + 2;
            // if ( y > 4){
                // y = y - 1;

            // }
            // 02 14 25 36 47

            // candidato: 4 out: 7 || arredondado: 415
            // x = x + 1;
            // y = y + x;
            // 01 13 26 310 410


            // candidato: 5 out: nenhum bate
            // if ( x > 5) {
            //    x = x + 1;
            //    if (y < 3) {
            //         x = x - 1;
            //     }
            // }
            // y = y + 2;
            // 02 14 26 38 410




            System.out.println(x + "" + y + "");
            x = x + 1;

        }

    }
}
