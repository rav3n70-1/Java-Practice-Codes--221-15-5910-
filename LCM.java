package Loop;
import java.util.Scanner;
public class LCM 
{
		public static void main(String[] args) 
	   {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter first number: ");
	    int num1 = sc.nextInt();
	    System.out.print("Enter second number: ");
	    int num2 = sc.nextInt();

	    int hcf = 1;
	    int min = Math.min(num1, num2);
	    for (int i = 2; i <= min; i++) {
	      if (num1 % i == 0 && num2 % i == 0) 
	    {
	        hcf = i;
	    }
	    }

	    int lcm = (num1 * num2) / hcf;
	    System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
	  }
}