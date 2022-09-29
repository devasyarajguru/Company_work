import java.util.Scanner;
class p4_task4 {
	public static void main(String[] args)
	{
		int n ;
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		n=sc.nextInt();  
		String[] names = new String[4];  
		System.out.println("Enter the elements of the array:");  for(int i=0; i<n; i++)  
		{  
			names[i]=sc.nextLine();  
		}  
	sc.close();
        
		// String names[]
		// 	= { "R", "A", "G", "R" };
		String temp;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
			
				// to compare one string with other strings
				if (names[i].compareTo(names[j]) > 0) {
					// swapping
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
	
		// print output array
		System.out.println(
			"The names in alphabetical order are: ");
		for (int i = 0; i < n; i++) {
			System.out.println(names[i]);
		}
	}
}

