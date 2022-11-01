import java.util.Scanner;

public class Example31 {
    public static void main(String[] argv) {

        int n;
        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Write a number");
        n = inputValue.nextInt();


            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= n - row; col++) {
                    System.out.print("/ ");

                }
                for(int col= row; col >=1; col--) {
                    System.out.print(col + " ");
                }
                for(int col = 2; col<= row; col++) {
                    System.out.print(col + " ");
                }
                for (int col =1; col <=n - row; col++) {
                    System.out.print("/ ");
                }
                System.out.println();


        }

    }
}

