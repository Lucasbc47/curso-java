{
    public static void main(String args[]){

        int x = 0;

        while (x < 4){
            /*
                a[empty]noise
                annoys
                an oyster
             */

            // Print (a)
            System.out.print("a");
            if(x < 1){
                // Empty space []
                System.out.print(" ");
                x = x + 2;
            }

            // Second time won't run since 2 > 1

            // Print first [n]
            // annoys
            System.out.print("n");

            // Won't run for first time
            if (x == 1){
                System.out.print(" oyster");
            }

            // First time == [0]; won't run also
            if (x > 1){
                System.out.print("noys");
            }

            // Runs by second so, output (a noise)
            if (x < 1){
                System.out.print("oise");
            }

            // now 0 == 2.
            System.out.println("");
            x = x + 1;
        }
    }
}

