public class Main {
    public static void main(String[] args) {
        int i, j;
        int count,c;

        for (i = 0; i < 6; i++) {
            System.out.println();
            c=i*2;
            for (j = 0; j < c-1; j++) {
                System.out.println("*");

            }
            for (count = 0; count < 10 - i * 2 ; count++) {

                System.out.print("*");
            }

        }

    }
}