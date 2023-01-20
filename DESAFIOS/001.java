public class Shuffle1 {
    public static void main(String[] args) {
        // First step
        int x = 3;
        // Second step
        while ( x > 0) {
            // Third step
            if (x == 2) {
                System.out.print("b c");
            }
            // Fourth Step
            if (x > 2) {
                System.out.print("a");
            }

            // Fifth Step
            x = x - 1;
            System.out.print("-");


            // Sixth step
            if (x == 1) {
                System.out.print("d");
                x = x -1;
            }
        }

    }
}
