class PoolPuzzleOne {
    public static void main(String args[]){

        int x = 0;

        while (x < 4){
            System.out.print("an");
            if(x < 1){
                System.out.print(" ");
            }
            if (x == 1){
                System.out.print("noys");
            }
            if (x > 1){
                System.out.print(" oyster");
                x = x + 2;
            }

            if (x < 1){
                System.out.print("noise");
            }

            System.out.println("");
            x = x + 1;
        }
    }
}


