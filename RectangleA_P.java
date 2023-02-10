package Fundamentals;

import java.util.Scanner;

public class RectangleA_P 
{

	public static void main(String[] args) 
	{
	       
	      Scanner x= new Scanner(System.in);
	        
	         System.out.println("Enter the length:");
	         double l= x.nextDouble();
	         System.out.println("Enter the width:");
	         double b= x.nextDouble();
	         double  area=l*b;
	      System.out.println("Area of Rectangle is: " + area); 

	}

}
