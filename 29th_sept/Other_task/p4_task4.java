package Other_task;

import java.util.Scanner;

public class p4_task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt(); // 153
        sc.close();
        
        int  mynum, remainder, result = 0;

        mynum = number; // 153

        while (mynum != 0)
        {
            remainder = mynum % 10; // 3   // 5
            result += Math.pow(remainder, 3); // 3*3*3 + // 5*5*5 + 1*1*1
            mynum /= 10; // 15 
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}


