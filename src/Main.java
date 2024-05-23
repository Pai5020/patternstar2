public class Main {
    public static void main(String[] args) {
        int i, j;
        int count,c;

        for (i = 0; i < 6; i++) {
            System.out.println();

            for (j = 0; j < i; j++) {
                System.out.println("*");

            }
            for (count = 0; count < 10 - i * 2 ; count++) {

                System.out.print("*");
            }

        }

    }
}