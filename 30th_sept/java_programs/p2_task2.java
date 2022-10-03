import java.math.BigDecimal;
import java.util.Scanner;
 
public class p2_task2 {
	
	public static void main(String[] args) {
		
		System.out.println("*** Program to print a decimal number in reverse order ***");
		System.out.println("Input a decimal number > ");
		
		try(Scanner scanner = new Scanner(System.in)){
			BigDecimal num = scanner.nextBigDecimal();
			
			// separate the integer part
			int integerPart = num.intValue();
			
			// separate the decimal part 
			BigDecimal dp = num.remainder(BigDecimal.ONE);
			
			// convert the decimal part into an integer
			while(dp.remainder(BigDecimal.ONE).floatValue() > 0){
				dp = dp.movePointRight(1);
			}
			int decimalPart = dp.intValue();
			
			System.out.println("Input decimal number in reverse order > ");
			
			// reverse the decimal part
			int remainder;
			while((remainder = decimalPart % 10) != 0){
				System.out.print(remainder);
				decimalPart = decimalPart/10;
			}
			
			System.out.print(".");
			
			// reverse the integer part
			while((remainder = integerPart % 10) != 0){
				System.out.print(remainder);
				integerPart = integerPart/10;
			}
		}
	}
}