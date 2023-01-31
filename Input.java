
package rohan.javaprograms;
import java.util.Scanner;

public class Input {
    public static void main(String[] args)
    {
       Scanner input = new Scanner (System.in) ;
       String name;
       System.out.print("Enter the Name :");
       name = input.nextLine();
       System.out.print("welcome = "+name);
    }
    
}
