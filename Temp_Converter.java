package Fundamentals;
import java.util.Scanner;
public class Temp_Converter 
{
	public static void main(String[] args) 
		  {
		    Scanner input = new Scanner(System.in);
		    System.out.print("Enter the temperature in Celsius: ");
		    double celsius = input.nextDouble();
		    double fahrenheit = (celsius * 9 / 5) + 32;
		    System.out.println("\nThe temperature in Fahrenheit is: " + fahrenheit);
		  }
}
