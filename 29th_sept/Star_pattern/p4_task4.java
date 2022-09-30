package Star_pattern;
import java.util.Scanner;

public class p4_task4 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number:");
    int n = sc.nextInt();

    for(int i=1;i<=n;i++)
    {
        for(int j=n;j>=i+1;j--)
        {
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++)
        {
            System.out.print(i+"*");
        }
        System.out.println();

    }
    sc.close();
   }
}
