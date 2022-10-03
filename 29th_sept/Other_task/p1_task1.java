package Other_task;
import java.util.*;
public class p1_task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Original string : ");
     
        String str = sc.nextLine();
     
        String words[] = str.split(" ");
        String str2 = "";
     
        //Reverse each word's position
        for (int i = 0; i < words.length; i++) { 
                if (i == words.length - 1) 
                  str2 = words[i] + str2; 
                else
                  str2 = " " + words[i] + str2; 
            } 
     
        // Displaying the string after reverse
        System.out.print("Reversed string : " + str2);
        sc.close();
    }
}
