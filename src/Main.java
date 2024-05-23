import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i, j;
        int count, N;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows : ");
        N=sc.nextInt();

        for (i = 0; i < N; i++) {

            for (j = 0; j < i; j++) {
                System.out.println("*");

            }
            for (count = 0; count <  (N - 1)* 2 - i * 2 ; count++) {

                System.out.print("*");
            }
            System.out.println();
        }

    }
}