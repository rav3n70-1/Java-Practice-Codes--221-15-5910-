package Fundamentals;
import java.util.Scanner;
public class BasicInputOutput 
{
	public static void main(String[] args) 
	{
			Scanner input = new Scanner(System.in);
		    System.out.print("Please enter your name: ");
		    String name = input.nextLine();
		    System.out.println("Hello, " + name + "!");
	}

}
