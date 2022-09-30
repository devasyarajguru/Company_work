package Other_task;

import java.util.Scanner;

public class p2_task2 {
    public static void main(String[] args) {
        int totalobjects, selectedobject, permutation, f1, f2;    
    Scanner sc = new Scanner(System.in);  
    System.out.println("Enter the Value of n and r: ");    
    totalobjects = sc.nextInt();    // 7
    selectedobject = sc.nextInt();  // 4
    sc.close();  
    f1 = totalobjects;   // 7
    for (int i = totalobjects - 1; i >= 1; i--)    
    {    
    f1 = f1 * i;    // 5040
    }    
    int number;    
    number = totalobjects - selectedobject;  // 7-4=3  
    f2 = number;   // 3 
    for (int i = number - 1; i >= 1; i--)    
    {    
    f2 = f2 * i;    // 6
    }    
    permutation = f1 / f2;   // 5040/6 
    System.out.println("The permutation of P(n, r) = "+permutation);
    }
}
