package Star_pattern;
import java.util.*;
public class p2_task2 {

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int rows=sc.nextInt();     //get input from user
    for(int i=1; i<=rows; i++){//parent for loop lterate rows
      for(int j=1; j<=i; j++){
      
      if(j==1 || j==i || i==rows){
         System.out.print("*");  //print star, when the condiiton is true
         }
         else{
         System.out.print(" ");
    }
    }
    System.out.println();//move to next line
    }
sc.close();
}
}
