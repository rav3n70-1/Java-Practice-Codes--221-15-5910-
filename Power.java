package Loop;
import java.util.Scanner;
public class Power 
{

	    public static void main(String[] args) 
	    {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Input base: ");
	        int base = input.nextInt();
	        System.out.print("Input exponent: ");
	        int exponent = input.nextInt();

	        int result = 1;
	        for (int i = 0; i < exponent; i++) 
	        {
	            result *= base;
	        }

	        System.out.println(base + "^" + exponent + " = " + result);
	    }
}
