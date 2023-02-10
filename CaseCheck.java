package IfElse;
import java.util.Scanner;
public class CaseCheck 
{
		public static void main(String[] args) 
	{
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter a character: ");
	    char character = scanner.next().charAt(0);
	    if (character >= 'A' && character <= 'Z') 
	    {
	      System.out.println(character + " is uppercase");
	    } 
	    else if (character >= 'a' && character <= 'z') 
	    {
	      System.out.println(character + " is lowercase");
	    } 
	    else 
	    {
	      System.out.println(character + " is not an alphabet");
	    }
	 }
}
