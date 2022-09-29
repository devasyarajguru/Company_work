import java.util.*;
public class p2_task2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);//creates an object of Scanner Class with name sc

          

            System.out.println("Enter the size of list ");
            int  n = sc.nextInt(); // it will store input

            ArrayList<Integer> arr = new ArrayList<Integer>();// creating an ArrayList object of Integer type..

            for(int i=0;i<n;i++)
            {
                arr.add(sc.nextInt());
                // Scanner reader = new Scanner(System.in);
                // int number = reader.nextInt(); 
                // arr.add(number); // adds input integer to arraylist
                
            }
            if(isListOdd(arr))
            {
                System.out.println("List contains only Odd elements");
            }
            else{
                System.out.println("List dosent contain only odd elements");
            }
            sc.close();
        }
            static boolean isListOdd(List<Integer> arr)
            {
                for(int i:arr)
                {
                    if(i%2==0)
                    return false;
                }

                return true;
            }
        }

