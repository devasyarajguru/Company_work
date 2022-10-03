package Star_pattern;

import java.util.*;

public class p6_task6 {

    public static void main(String[] args) {

        int i, j, k;
        System.out.println("Enter the length of pattern : ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (i = 1; i <= n; i++) {

            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1) || k % 2 != 0) {

                    System.out.print("*");

                } else {

                    System.out.print(i-1);
                }
            }
            System.out.println();
        }

        for (i = n-1; i >= 1; i--) {

            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1) || k % 2 != 0) {

                    System.out.print("*");

                } else {

                    System.out.print(i-1);
                }
            }
            System.out.println("");
        }
    }
}