package Fundamentals;
import java.util.Scanner;
public class Triangle_Area 
{

		public static void main(String[] args) 
		  {
		    Scanner input = new Scanner(System.in);
		    System.out.print("Enter the base of the triangle: ");
		    double base = input.nextDouble();
		    System.out.print("Enter the height of the triangle: ");
		    double height = input.nextDouble();
		    double area = (base * height) / 2;
		    System.out.println("\nThe area of the triangle is: " + area + " Sq. Units");
		  }
}