package IfElse;

import java.util.Scanner;

public class MaxBetweenThreeNumbers 
{
	  public static void main(String[] args) 
	  	{
		    Scanner scanner = new Scanner(System.in);

		    System.out.print("Enter 1st number: ");
		    int num1 = scanner.nextInt();

		    System.out.print("Enter 2nd number: ");
		    int num2 = scanner.nextInt();

		    System.out.print("Enter 3rd number: ");
		    int num3 = scanner.nextInt();

		    int max = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
		    System.out.println("Maximum number is: " + max);
		  }
}
