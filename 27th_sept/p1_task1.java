import java.util.Scanner;

public class p1_task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sce = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sce.nextInt();

        System.out.println("Before Swapping");
        System.out.println("Value of x is:" + x);
        System.out.println("Value of y is:" + y);

        x = x + y; // x = 30
        y = x - y; // y = 10
        x = x - y; // x = 20
        
        System.out.println("After Swapping");
        System.out.println("Value of x is:" + x);
        System.out.println("Value of y is:" + y);

        sc.close();
        sce.close();
    }
}
