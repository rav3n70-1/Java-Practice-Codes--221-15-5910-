package Fundamentals;
import java.util.Scanner;
public class Square_Root 
{
	  public static void main(String[] args) 
	  {
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("Enter a number: ");
	    double number = input.nextDouble();
	    
	    double squareRoot = Math.sqrt(number);
	    
	    System.out.println("\nThe square root of " + number + " is " + squareRoot);
	  }
}

