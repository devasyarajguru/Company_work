package Other_task;
import java.util.*;

public class p6_task6 {
    static int findWays(int d , int N)
{
     
   if(N < 0)
   return 0;

   else if(N == 0 && d!=0 )
   {
    return 0 ;
   }

   else if(d==0 && N!=0)
   {
    return 0;
   }

   else if(d==0 && N==0)
   {
    return 1;
   }
   
    int cnt = 0;
 
    for(int i = 1; i <= 6; i++)
    {
    
            cnt = cnt +findWays(d-1,N - i);        
    }
    
    return cnt;
}

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int d = sc.nextInt();
    System.out.println("Enter a sum");
    int N = sc.nextInt();

    System.out.print(findWays(d,N));
    sc.close();
}
 
}
