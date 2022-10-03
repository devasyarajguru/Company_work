package Star_pattern;

import java.util.Scanner;

public class p5_task5 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of star : ");
		int len = sc.nextInt();
		
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				if(j==0 || j==len-1 || i==j || i+j==(len-1))
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
                sc.close();
			}
			System.out.println("");
		}

	}

}
